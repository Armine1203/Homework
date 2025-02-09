package hw23_Calculator.VariantWithMethodReference;

import hw23_Calculator.CalculatorException;
import hw23_Calculator.VariantWithLambda.Calculator;

public class CalculatorMethodReferenceDemo {
    public static void main(String[] args) {
        Calculator add = CalculatorMethodReference::add;
        Calculator subtract = CalculatorMethodReference::subtract;
        Calculator divide = CalculatorMethodReference::divide;
        Calculator multiply = CalculatorMethodReference::multiply;

        try {
            System.out.println("Add " + add.calculate(2.5, 4));
            System.out.println("Subtract " + subtract.calculate(2.8, 6));
            System.out.println("Multiply " + multiply.calculate(10, 41));
            System.out.println("Divide " + divide.calculate(5, 4));
            System.out.println("Divide " + divide.calculate(2.5, 0));
        }catch (CalculatorException e){
            System.out.println("Error " + e);
        }

    }
}
