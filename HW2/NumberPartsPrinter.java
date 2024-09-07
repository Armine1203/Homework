package HW2;

import java.util.Scanner;

public class NumberPartsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = scanner.nextInt();
        System.out.println("number " + number);

        int thousandPart = number / 1000;
        System.out.println("thousand part is " + thousandPart);

        int hundredPart = (number / 100) % 10;
        System.out.println("hundred part is " + hundredPart);

        int tenPart = (number / 10) % 10;
        System.out.println("tenth part is " + tenPart);

        int unitPart = number % 10;
        System.out.println("unit part is " + unitPart);
    }
}
