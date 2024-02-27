package seminar04;

import org.junit.jupiter.api.Test;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MainTest {
    /**
     * 4.0. Проверка работы Mockito
     */
    @Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова  “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
    @Test
    public void iteratorWillReturnHelloWorld() {

// Arrange
            Iterator iteratorMock = mock(Iterator.class);
// Act
            when(iteratorMock.next()).thenReturn("Hello","World") ;
            String result = iteratorMock.next() + " " + iteratorMock.next();
// Assert
            assertEquals("Hello World",result);

    }
}
