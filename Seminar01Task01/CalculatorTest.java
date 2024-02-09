package Seminar01Task01;

import org.assertj.core.api.Assertions;


public class CalculatorTest {
    public CalculatorTest() {
    }

    public static void main(String[] args) throws Calculator.ArithmeticException {
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        } else if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        } else if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        } else if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        } else {
            try {
                Calculator.calculation(8, 4, '_');
            } catch (IllegalStateException var2) {
                if (!var2.getMessage().equals("Unexpected value operator: _")) {
                    throw new AssertionError("Ошибка в методе");
                }
            }

            assert 8 == Calculator.calculation(2, 6, '+');

            assert 0 == Calculator.calculation(2, 2, '-');

            assert 14 == Calculator.calculation(2, 7, '*');

            assert 2 == Calculator.calculation(100, 50, '/');

            Assertions.assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
            Assertions.assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
            Assertions.assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
            Assertions.assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
            Assertions.assertThatThrownBy(() -> {
                Calculator.calculation(8, 4, '_');
            }).isInstanceOf(IllegalStateException.class);
            System.out.println(Calculator.calculation(Integer.MAX_VALUE, 1, '+'));
            System.out.println(Calculator.squareRootExtraction(169.0));

            assert 80.0 == Calculator.calculatingDiscount(100, 20) : "Неправильный расчёт";
            Assertions.assertThatThrownBy(() -> {
                Calculator.calculatingDiscount(-100, 10);}).isInstanceOf(ArithmeticException.class);
            Assertions.assertThatThrownBy(() -> {
                Calculator.calculatingDiscount(100, -10);}).isInstanceOf(ArithmeticException.class);
            Assertions.assertThatThrownBy(() -> {
                Calculator.calculatingDiscount(100, 1000);}).isInstanceOf(ArithmeticException.class);


        }
    }
}


