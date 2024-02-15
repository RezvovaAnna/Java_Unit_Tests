package Test.seminar01task01;

import Seminar01Task01.Calculator;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CalculatorTest {
    public CalculatorTest() {
    }
    @Test
    void additionExpressionEvaluation() throws Calculator.ArithmeticException {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2,6,'+')).isEqualTo(8);
    }
    @Test
    void subtractionExpressionEvaluation () throws Calculator.ArithmeticException {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2,2,'-')).isEqualTo(0);
    }
    @Test
    void multiplicationExpressionEvaluation () throws Calculator.ArithmeticException {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2,7,'*')).isEqualTo(14);
    }
    @Test
    void divisionExpressionEvaluation () throws Calculator.ArithmeticException {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(100,50,'/')).isEqualTo(2);
    }
    @Test
    void expectedIllegalStateExceptionOnInvalidOperatorSymbol () {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void testCalaculatingDiscount () throws Calculator.ArithmeticException {
       assertThat(Calculator.calculatingDiscount(100, 20)).isEqualTo(80);

    }

    @Test
    void testNegativePriceCalculatingDiscount () {
        assertThatThrownBy( ()->{
            assertThat(Calculator.calculatingDiscount(-100, 20));}
        ).isInstanceOf(Calculator.ArithmeticException.class).hasMessage( "Отрицательная цена");
    }

    @Test
    void testNegativeDiscountCalculatingDiscount () {
        assertThatThrownBy( ()->{
            assertThat(Calculator.calculatingDiscount(100, -20));}
        ).isInstanceOf(Calculator.ArithmeticException.class).hasMessage("Отрицательная скидка");
    }

    @Test
    void testZeroDiscountCalculatingDiscount () {
        assertThatThrownBy( ()->{
            assertThat(Calculator.calculatingDiscount(100, 0));}
        ).isInstanceOf(Calculator.ArithmeticException.class).hasMessage("Cкидка должна быть больше нуля");
    }

    @Test
    void testDiscountIsHundredCalculatingDiscount () {
        assertThatThrownBy( ()->{
            assertThat(Calculator.calculatingDiscount(100, 101));}
        ).isInstanceOf(Calculator.ArithmeticException.class).hasMessage("Скидка больше 100%");
    }

}




