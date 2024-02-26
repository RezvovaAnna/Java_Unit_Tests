package seminar04.httpC;

import Seminar04.httpC.HttpClient;
import Seminar04.httpC.WebService;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *4.7 Вам нужно написать тест с использованием моков для класса, который выполняет HTTP-запросы.
 * Условие: У вас есть класс HttpClient с методом public String get(String url), который выполняет
 * HTTP-запрос и возвращает результат. Вам необходимо проверить правильность работы класса
 * WebService, который использует HttpClient для получения данных с веб-сайта.
 **/

public class WebServiceTest {

    @Test
    void testWebService() {
        HttpClient httpClient = mock(HttpClient.class);
        WebService webService = new WebService(httpClient);
        when(httpClient.get(anyString())).thenReturn("Ok");
        String result = webService.request("body");
        assertThat(result).isEqualTo("Ok");

    }

}
