package Seminar01Task01;

public class Calculator {
    public Calculator() {
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) throws ArithmeticException {
        int result;
        switch (operator) {
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '+':
                result = firstOperand + secondOperand;
                break;
            case ',':
            case '.':
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '/':
                if (secondOperand == 0) {
                    throw new ArithmeticException("Division by zero is not possible");
                }

                result = firstOperand / secondOperand;
        }

        return result;
    }

    public static double squareRootExtraction(double number) throws ArithmeticException {
        if (number == 0.0) {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        } else if (number < 0.0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        } else {
            double squareRoot = number / 2.0;

            double t;
            do {
                t = squareRoot;
                squareRoot = (squareRoot + number / squareRoot) / 2.0;
            } while (t - squareRoot != 0.0);

            return squareRoot;
        }
    }

}
