package HW3;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNum = scanner.nextInt();
        int reverseNum;

        if (positiveNum >= 100 && positiveNum < 1000) {
            int hundredPart = (positiveNum / 100);
            int tenPart = (positiveNum / 10) % 10;
            int unitPart = positiveNum % 10;
            int temporary = hundredPart;

            if (unitPart != 0) {
                hundredPart = unitPart;
                unitPart = temporary;
                reverseNum = hundredPart * 100 + tenPart * 10 + unitPart;
                System.out.println("reverseNum is " + reverseNum);
            } else {
                System.out.println("Incorrect reverse number example");
                System.exit(0);
            }

        } else {
            System.out.println("Enter a number between 100 and 999");
            System.exit(0);
        }

    }
}
