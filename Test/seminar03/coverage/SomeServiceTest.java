package seminar03.coverage;

import Seminar03.coverage.SomeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class SomeServiceTest {

    SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    // 3.1.
    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertEquals("Fizz", someService.fizzBuzz(6));
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz() {
        assertEquals("Buzz", someService.fizzBuzz(10));
    }

    @Test
    void multipleFiveAndThreeReturnsFizzBuzz() {
        assertEquals("FizzBuzz", someService.fizzBuzz(30));
    }

    @Test
    void notMultipleReturnNum() {
        assertEquals("7", someService.fizzBuzz(7));
    }

    @Test
    void firstNumberIsSixReturnTrue() {
        int[] maArray = new int[]{6, 4, 3, 0};
        assertTrue(someService.firstLast6(maArray));
    }

    @Test
    void lastNumberIsSixReturnTrue() {
        int[] maArray = new int[]{0, 4, 3, 6};
        assertTrue(someService.firstLast6(maArray));
    }

    @Test
    void numberNotIsSixReturnFalse() {
        int[] maArray = new int[]{0, 4, 3, 5};
        assertFalse(someService.firstLast6(maArray));
    }

    @ParameterizedTest
    @CsvSource({"2000.0, 50, 1000.0", "2000.0, 100, 0", "2000.0, 0, 2000.0"})
    void normalDiscountTest( Double purchase, Integer discount, Double price) {
        assertThat(someService.calculatingDiscount(purchase, discount))
                .isEqualTo(price); // обычная скидка
    }

    @ParameterizedTest
    @CsvSource({"2000.0, 101", "2000.0, -10"})
   void badDiscountTest(Double purchase, Integer discount) {
        assertThatThrownBy(() ->
            someService.calculatingDiscount(purchase, discount))
           .isInstanceOf(ArithmeticException.class)
          .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%
       }

    @ParameterizedTest
    @CsvSource({"5, 5, 25", "10, 9, 16", "7, 7, 21"})
    void luckySumWithoutThirteenTest(Integer a, Integer b, Integer c) {
        assertEquals(35, someService.luckySum(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({"13, 8, 3", "8, 3, 13", "3, 13, 8"})
   void luckySumTest(Integer a, Integer b, Integer c) {
        assertEquals(11, someService.luckySum(a, b, c));

   }

    //ДЗ 3.1
    @ParameterizedTest
    @ValueSource(ints = {2,4,10,56,1002})
   void testEvenOddNumber(Integer n) {
       assertTrue(someService.evenOddNumber(n));
   }

    //ДЗ 3.1
    @ParameterizedTest
    @ValueSource(ints = {1,5,1001})
    void testNotEvenOddNumber(Integer n) {
        assertFalse(someService.evenOddNumber(n));
    }

    //ДЗ 3.2

    @ParameterizedTest
    @ValueSource(ints = {26,27,55,98,99})
    void testTrueNumberInInterval(Integer n) {
        assertTrue(someService.numberInInterval(n));
    }
    //ДЗ 3.2
    @ParameterizedTest
    @ValueSource(ints = {-1,0, 25,100,101})
    void testFalseNumberInInterval(Integer n) {
        assertFalse(someService.numberInInterval(n));
    }




}
