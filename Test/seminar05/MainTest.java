package seminar05;

import Seminar05.number.MaxNumberModule;
import Seminar05.number.RandomNumberModule;
import Seminar05.order.OrderService;
import Seminar05.order.PaymentService;
import Seminar05.user.UserRepository;
import Seminar05.user.UserService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    //5.1.
    @Test
    void testMaxNumberModule() {
        MaxNumberModule maxNumberModuleTest = new MaxNumberModule();
        RandomNumberModule randomNumberModuleTest = new RandomNumberModule();

        ArrayList<Integer> numbers = randomNumberModuleTest.numbers(10);
        Integer value = maxNumberModuleTest.maxValue(numbers);

        assertThat(value).isEqualTo(Collections.max(numbers));
    }

    //5.2.
    @Test
    void testGetUserName() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(1);

        assertEquals("User 1",result);

    }

    //5.3.

    //public class IntegrationTest {
    @Test
    void testPaymentService() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("A", 1);

        assertTrue(result);
    }


}

