// Ունեք ցանկացած չափի դրական ամողջ թիվ։
// Տպեք տվյալ թվի բոլոր թվանշանները՝ ձախից աջ։
// Ձեր սկզբնական թիվը կարաք փոփոխեք ոնց ուզեք։
//3
package HW5;

import java.util.Scanner;

public class PrintPartOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number!!!!!");
            System.exit(0);
        }
        int divisor = 1;
        while ((n / divisor) >= 10) {
            divisor = divisor * 10;
        }
        while (divisor > 0 ){
            System.out.print(n/divisor + " ");
            n = n % divisor;
            divisor = divisor / 10;
        }


    }
}
