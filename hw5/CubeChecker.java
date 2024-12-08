package HW5;//Ունեք ցանկացած ամբողջ թիվ, որը ներմուծում եք։
// Ձեր խնդիրնա պարզել, թե արդյոք տվյալ թիվը հանդիսանումա մեկ այլ ամբողջ թվի խորանարդ։
// Եթե հա, տպեք էդ թիվը, հակառակ դեպքում զուտ հաղորդագրություն տպեք, որ ձեր ներմուծածը
// չի հանդիսանում որևէ ամբողջ թվի խորանարդ.

//4

import java.util.Scanner;

public class CubeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();

        if (a < 0) {
            for (int i = 0; i * i * i >= a; i--) {
                if (i * i * i == a) {
                    System.out.println("i = " + i);
                    break;
                }
            }
        }
        else if (a>0) {
            for (int i = 0; i * i * i <= a; i++) {
                if (i * i * i == a) {
                    System.out.println("i = " + i);
                    break;
                }
            }
        }

        else {
            System.out.println("There is no whole number whose cube is equal " + (a));
            System.out.println(0);
        }

    }
}
