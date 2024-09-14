package HW4;

import java.util.Scanner;

public class ArrayValueByEnteringNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        System.out.println("Enter array's length");
        int n = scanner.nextInt();
        System.out.println("Enter index");
        int a = scanner.nextInt();

        if (n <= 0 || a < 0 || n - a <= 3) {
            System.exit(0);

        } else {
            array = new int[n];
            array[a + 1] = a + 1;
            array[a + 2] = a + 2;
            array[a + 3] = a + 3;
        }


    }
}
