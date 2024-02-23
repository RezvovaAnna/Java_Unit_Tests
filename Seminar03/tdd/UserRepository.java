package Seminar03.tdd;

import java.util.ArrayList;
import java.util.List;


// ДЗ 3.3
public class UserRepository {
    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate) {
            data.add(user);
       }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logOutOnlyUser() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.setAuthenticate(false);
            }
        }
        data.removeIf(user -> !user.isAdmin);
    }

}

