/*
Ունեք ֆիքսված n չափանի ամբողջ թվերի զանգված (այլ կերպ զանգվածին անվնանում են մասիվ)։
n-ը որպես ինփութ ծրագիրը ստանումա command line-ից, ու կարա մաքսիմումը լինի 8 չափի։
Դրանից հետո պետքա ներմուծեք 2 թիվ` a ու b, որոնցից փոքրի արժեքը պետքա տաք մասիվի մեջտեղից
(երկարության կեսը՝ ամբողջ թվով) անմիջապես ձախ գտնվող անդամին, իսկ մեծը՝ մեջտեղից անմիջապես աջ գտնվող անդամին։

*/
package HW4;

import java.util.Scanner;

public class ArraysInitalizationMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's length");
        int n = scanner.nextInt();

        if (n < 0 || n > 8) {
            System.exit(0);
        } else {
            int[] array = new int[n];
            System.out.println("Enter number 1");
            int a = scanner.nextInt();

            System.out.println("Enter number 2");
            int b = scanner.nextInt();

            array[array.length / 2 - 1] = (a < b) ? a : b;
            array[array.length / 2 + 1] = (a > b) ? a : b;

            System.out.println(array[array.length / 2 - 1]);
            System.out.println(array[array.length / 2 + 1]);
        }
    }
}
