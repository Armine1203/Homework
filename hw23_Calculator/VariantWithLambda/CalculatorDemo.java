/*
Էդ exception ը սխալ պարամետրերի դեպքում կօգտագործեք։ Լամբդաներով իմպլեմենտ եք անում չորս տարբեր մաթեմատիկական օպերացիաները համապատասխանաբար ու կիրառում եք։
*/
package hw23_Calculator.VariantWithLambda;

import hw23_Calculator.CalculatorException;
import hw23_Calculator.VariantWithLambda.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator divide = (a, b) -> {
            if (b != 0) return a / b;
            throw new CalculatorException("Division by zero invalid");
        };
        Calculator multiply = (a, b) -> a * b;

        try {
            System.out.println("Add " + add.calculate(10.5, 4));
            System.out.println("Subtract " + subtract.calculate(10.5, 4));
            System.out.println("Multiply " + multiply.calculate(10.5, 4));
            System.out.println("Divide " + divide.calculate(10.5, 4));
            System.out.println("Divide " + divide.calculate(10.5, 0));
        } catch (CalculatorException e) {
            System.out.println("Error " + e);
        }
    }
}
