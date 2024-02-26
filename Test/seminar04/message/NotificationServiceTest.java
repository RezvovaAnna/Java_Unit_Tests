package seminar04.message;

import Seminar04.message.MessageService;
import Seminar04.message.NotificationService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 *4.5 Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
 * Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String
 * recipient), который отправляет сообщение получателю.
 * Вам необходимо проверить правильность работы класса NotificationService, который использует
 * MessageService для отправки уведомлений.
 **/

public class NotificationServiceTest {

    @Test
    void testNotificationService() {
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Hi!", "Ivan");
        verify(messageService, times(1)).sendMessage("Hi!", "Ivan");
    }
}
