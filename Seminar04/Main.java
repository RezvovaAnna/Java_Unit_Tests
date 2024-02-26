package Seminar04;

import Seminar04.book.Book;
import Seminar04.book.BookRepository;
import Seminar04.book.BookService;
import Seminar04.book.InMemoryBookRepository;
import Seminar04.database.DataProcessor;
import Seminar04.database.Database;
import Seminar04.hotel.BookingService;
import Seminar04.hotel.HotelService;
import Seminar04.message.MessageService;
import Seminar04.message.NotificationService;
import Seminar04.weather.WeatherReporter;
import Seminar04.weather.WeatherService;

import java.util.List;

public class Main {

    //**
    // 4.3. Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
    // обращающийся к внешнему API для получения информации о текущей температуре.
    // Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
    // Создайте мок-объект для WeatherService с использованием Mockito.
    // *

    public static void main(String[] args) {
        // Создаем объект WeatherService. В реальной программе, этот класс
        // бы обращался к внешнему API для получения температуры.
        WeatherService weatherService = new WeatherService();

        // Создаем объект WeatherReporter, передаем ему WeatherService в конструктор.
        WeatherReporter weatherReporter = new WeatherReporter(weatherService);

        // Получаем отчет о погоде.
        String report = weatherReporter.generateReport();

        // Выводим отчет на консоль.
        System.out.println(report);
    }
}
