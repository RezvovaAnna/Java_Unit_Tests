package seminar04.weather;

import Seminar04.weather.WeatherReporter;
import Seminar04.weather.WeatherService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class WeatherReporterTest {
    /**
     * 4.3. Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
     * обращающийся к внешнему API для получения информации о текущей температуре.
     * Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
     * Создайте мок-объект для WeatherService с использованием Mockito.`
     **/

    @Test
    void testGenerateReport(){

        WeatherService weatherService = mock(Seminar04.weather.WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        when(weatherService.getCurrentTemperature()).thenReturn(15);
        String result = weatherReporter.generateReport();
        assertThat(result).isEqualTo("Текущая температура: " + 15 + " градусов.");

    }

}
