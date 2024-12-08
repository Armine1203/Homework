package HW3;

import java.util.Scanner;

public class CreatingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number");
        int num3 = scanner.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            if ((num1 + num2 > num3) && (num1 + num3 > num2) && (num2 + num3 > num1)) {
                System.out.println("We can create triangle with " + num1 + ", " + num2 + ", " + num3 + " sides");
            } else {
                System.out.println("We cannot create triangle with " + num1 + ", " + num2 + ", " + num3 + " sides");
                System.exit(0);
            }
        }else {
            System.out.println("The number(s) less than or equal to 0");
            System.exit(0);
        }


    }
}