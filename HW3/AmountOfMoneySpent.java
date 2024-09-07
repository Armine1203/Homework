package HW3;

import java.util.Scanner;

public class AmountOfMoneySpent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you VIP client?  true/false");
        boolean isVipClient = scanner.nextBoolean();

        System.out.println("Enter your age");
        int minage = scanner.nextInt();

        int entryAmount = 5000;
        int orderAmount;
        int totalAmountSpent;

        if (isVipClient == false && minage >= 16) {
            System.out.println("Enter your order amount");
            orderAmount = scanner.nextInt();
            totalAmountSpent = entryAmount + orderAmount;
            System.out.println("Your total amount spent is "+ totalAmountSpent);

        } else if (isVipClient == false && minage < 16) {
            System.out.println("Sorry! Bye!");
            System.exit(0);

        } else if (isVipClient == true && minage < 16) {
            System.out.println("Sorry! Bye");
            System.exit(0);

        } else if (isVipClient == true && minage >= 16) {
            System.out.println("Enter your order amount");
            orderAmount = scanner.nextInt();
            totalAmountSpent = orderAmount - (orderAmount * 15 / 100);
            System.out.println("Your total amount spent is "+totalAmountSpent);
        }

    }
}
