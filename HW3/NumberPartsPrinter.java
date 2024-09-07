/*
Ենթադրենք ունենք քառանիշ թիվ, որը ստանումա ծրագիրը որպես մուտք։
Պետքա գրեք ծրագիր, որը կստանա ու կտպի տվյալ թվի բոլոր թվանշանները։
Ծրագիրը պետքա աշխատի ցանկացած քառանիշ թվի համար։
 */
package HW3;

import java.util.Scanner;

public class NumberPartsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = scanner.nextInt();

        if (number >= 1000 && number <= 9999) {
            System.out.println("number is " + number);

            int thousandPart = number / 1000;
            System.out.println("thousand part is " + thousandPart);

            int hundredPart = (number / 100) % 10;
            System.out.println("hundred part is " + hundredPart);

            int tenPart = (number / 10) % 10;
            System.out.println("tenth part is " + tenPart);

            int unitPart = number % 10;
            System.out.println("unit part is " + unitPart);
        }else {
            System.out.println("Invalid data. Please try again!");
        }

    }
}
