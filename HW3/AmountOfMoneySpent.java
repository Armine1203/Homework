package HW3;

import java.util.Scanner;

public class AmountOfMoneySpent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you VIP client?  true/false");
        boolean isVipClient = scanner.nextBoolean();

        System.out.println("Enter your age");
        int minage = scanner.nextInt();

        System.out.println("Enter your order amount");
        int orderAmount = scanner.nextInt();

        int entryAmount = 5000;
        int totalAmountSpent;

        if (minage >= 16) {
            if (isVipClient == false) {
                totalAmountSpent = entryAmount + orderAmount;
                System.out.println("Your total amount spent is " + totalAmountSpent);

            } else {
                totalAmountSpent = orderAmount - (orderAmount * 15 / 100);
                System.out.println("Your total amount spent is " + totalAmountSpent);
            }
        } else {
            System.out.println("Sorry! Bye!");
            System.exit(0);
        }

    }
}
