package hw23_Calculator.VariantWithLambda;

import hw23_Calculator.CalculatorException;

@FunctionalInterface
public interface Calculator {
    abstract public double calculate(double a, double b) throws CalculatorException;
}
/*
ստեղծում եք կալկուլյատորի functional interface, իրա calculate մեթոդով,
որը ստանումա երկու հատ թիվ ու վերադարձնումա թիվ ու նաև իրա signature ի մասա
կազմում ինչ-որ ձեր սարքած custom checked exception։
*/
