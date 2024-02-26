package seminar04.hotel;

import Seminar04.hotel.BookingService;
import Seminar04.hotel.HotelService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *4.4 Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
 *Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId),
 *который обычно проверяет, доступен ли номер в отеле.
 *Вам необходимо проверить правильность работы класса BookingService, который
 *использует HotelService для бронирования номера, если он доступен.
 **/

public class BookingServiceTest {

    @Test
    void testBookingService() {
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);
        when(hotelService.isRoomAvailable(12)).thenReturn(true);
        boolean result = bookingService.bookRoom(12);
        assertThat(result).isTrue();
    }
}
