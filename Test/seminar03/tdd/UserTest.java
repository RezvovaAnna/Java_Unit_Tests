package seminar03.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Seminar03.tdd.UserRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import Seminar03.tdd.User;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;




//ДЗ 3.3
public class UserTest {

    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        User first_user = new User("Ivan", "123", false);
        User second_user = new User("Nikita", "авв1", false);
        User third_user = new User("Alexander", "авdf1", false);
        User fourth_user = new User("Roman", "а45в1", true);
        User fifth_user = new User("Gavrila", "65df1", true);
        first_user.authenticate("Ivan", "123");
        second_user.authenticate("Nikita", "авв1");
        third_user.authenticate("Alexander", "авf1"); // Ошибка пароля
        fourth_user.authenticate("Roman", "а45в1");
        fifth_user.authenticate("Gavrla", "65df1"); // Ошибка имени
        userRepository.addUser(first_user);
        userRepository.addUser(second_user);
        userRepository.addUser(third_user);
        userRepository.addUser(fourth_user);
        userRepository.addUser(fifth_user);

    }

    @ParameterizedTest
    @ValueSource( strings = {"Alexander", "Gavrla", "Anna"})
    public void testNotAuthenticateUserRepository(String name) {
        assertFalse(userRepository.findByName(name));

    }

    @ParameterizedTest
    @ValueSource( strings = {"Ivan", "Nikita","Roman"})
    public void testAuthenticateUsersRepository(String name) {
        assertTrue(userRepository.findByName(name));
    }

    @ParameterizedTest
    @ValueSource( strings = {"Ivan", "Nikita"})
    public void testLogOutUser(String name) {
        userRepository.logOutOnlyUser();
        assertFalse(userRepository.findByName(name));
    }

    @Test
    public void testLogOutNotAdmin() {
        userRepository.logOutOnlyUser();
        assertTrue(userRepository.findByName("Roman"));

    }

}
