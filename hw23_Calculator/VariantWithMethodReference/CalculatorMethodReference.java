package hw23_Calculator.VariantWithMethodReference;

import hw23_Calculator.CalculatorException;

public class CalculatorMethodReference {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) throws CalculatorException {
        if (b != 0) return a / b;
        throw new CalculatorException("Division by zero invalid");
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}
