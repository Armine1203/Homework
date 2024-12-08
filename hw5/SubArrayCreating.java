package HW5;

import java.util.Scanner;

//Ունեք ֆիքսված n չափանի ամբողջ թվերի զանգված։
// n-ը որպես input ծրագիրը ստանումա command line-ից, դրանից հետո պետքա ներմուծեք 2 թիվ` a ու b։
// էս անգամ պետքա 2-րդ զանգվածի մեջ գցեք առաջին զանգվածի a-րդ ինդեքսից b-րդ ինդեքս ընկած բոլոր
// էլեմենտները։ Պետքա 2-րդ զագնվածում վերագրումը սկսեք առաջին էլեմենտից սկսած (այսինքն 0-րդ)

//1

public class SubArrayCreating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array's length");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        int[] array2;

        System.out.println("Enter a numbers for array");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }
        // n>0 , a>0 , b>0 , a+b<=n
        System.out.println("Enter number a");
        int a = scanner.nextInt();

        System.out.println("Enter number b");
        int b = scanner.nextInt();

        if (n <= 0 || a < 0 || b < 0 || a + b > n) {
            System.out.println("Invalid input");
            System.exit(0);
        } else {
            array2 = new int[b + 1];
            for (int i = 0; i <= b; i++) {
                array2[i] = array1[a++];
            }

            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        }

    }
}
