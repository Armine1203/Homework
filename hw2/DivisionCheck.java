package HW2;

import java.util.Scanner;

public class DivisionCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a % b == 0);
    }
}
