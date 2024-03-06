package Seminar06;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageAnalyse {

    public static Double findAverage(int[] array) {
        int sumArr = IntStream.of(array).sum();
       return  (double) sumArr / array.length;

       //IntStream.of(array).average();

    }
    public static String analyseArrays(Double res1, Double res2) {
        if (res1 > res2) {
            return "Первый список имеет большее среднее значение: " + res1;
        }
        if (res2 > res1) {
            return "Второй список имеет большее среднее значение: " + res2;
        }
        else {
            return "Средние значения равны: " + res1;
        }
    }
}
