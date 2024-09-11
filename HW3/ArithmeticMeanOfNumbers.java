package HW3;

import java.util.Scanner;

public class ArithmeticMeanOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        short a = scanner.nextShort();

        System.out.println("Enter the second number");
        short b = scanner.nextShort();

        System.out.println("Enter the third number");
        short c = scanner.nextShort();

        int arithmeticMean = (a + b + c) / 3;
        System.out.println("Arithmetic mean of " + a + ", " + b + ", " + c + " is " + arithmeticMean);

        if (a < 0) {
            a = (short) (a * (-1));
        }
        if (b < 0) {
            b = (short) (b * (-1));
        }
        if (c < 0) {
            c = (short) (c * (-1));
        }

        int sumOfAbsoluteValues = a + b + c;
        System.out.println("sumOfAbsoluteValues = " + sumOfAbsoluteValues);

        if (arithmeticMean != 0) {
            int result = sumOfAbsoluteValues / arithmeticMean;
            System.out.println("result = " + "sumOfAbsoluteValues " + "/" + " arithmeticMean" + " = " + result);
        } else {
            System.out.println("the number is not divisible by 0");
            System.exit(1);
        }
    }
}
