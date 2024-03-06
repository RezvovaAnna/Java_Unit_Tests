package seminar06;

import Seminar06.AverageAnalyse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AverageAnalyseTest {

     @ParameterizedTest
     @CsvSource({"11 9 15 5", "7 23 2 10 8", "10 10 10"})
     public void testFindAverage(String arr) {
         int[] arr2 = Arrays.stream(arr.split("\\s+"))
                 .mapToInt(Integer::parseInt).toArray();
         assertEquals(10.0, AverageAnalyse.findAverage(arr2));
   }

    @ParameterizedTest
    @CsvSource({"0 -4 0 -8", "-7 -2 -2 -1", "-3 0 -6"})
    public void testFindAverageZeroAndNegativeNum(String arr) {
         int[] arr2 = Arrays.stream(arr.split("\\s+"))
                 .mapToInt(Integer::parseInt).toArray();
       assertEquals(-3.0, AverageAnalyse.findAverage(arr2));
    }

    @ParameterizedTest
    @CsvSource({"4.2 4.1","4.2 -4.2","4.2 0"})
    public void testAnalyseArraysFirstArrayBigger(String arr1) {
         double[] res = Arrays.stream(arr1.split("\\s+"))
            .mapToDouble(Double::parseDouble).toArray();
         double res1 = res[0];
         double res2 = res[1];
        assertEquals("Первый список имеет большее среднее значение: 4.2", AverageAnalyse.analyseArrays(res1, res2));

    }

    @ParameterizedTest
    @CsvSource({"1.2 1.3","-1.3 1.3","0 1.3"})
    public void testAnalyseArraysSecondArrayBigger(String arr1) {
        double[] res = Arrays.stream(arr1.split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();
        double res1 = res[0];
        double res2 = res[1];
        assertEquals("Второй список имеет большее среднее значение: 1.3", AverageAnalyse.analyseArrays(res1, res2));

    }

    @Test
    public void testAnalyseArraysNegativeValue() {
        double res1 = -1.4;
        double res2 = -1.3;
        assertEquals("Второй список имеет большее среднее значение: -1.3", AverageAnalyse.analyseArrays(res1, res2));

    }

   @Test
    public void testAnalyseArraysEqual() {
        double res1 = 5.5;
        double res2 = 5.5;
        assertEquals("Средние значения равны: 5.5", AverageAnalyse.analyseArrays(res1, res2));

    }

    @Test
    public void testAnalyseArraysEqualNegative() {
        double res1 = -7.0;
        double res2 = -7.0;
        assertEquals("Средние значения равны: -7.0", AverageAnalyse.analyseArrays(res1, res2));

    }

}
