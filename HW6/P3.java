//Ենթադրենք ունենք 2 հատ զանգված տարբեր չափերով։ Ենթադրվումա, որ
//arr2.length < arr1.length ու arr2.lentgh > 1
//2 զանգվածների մեջ էլ չկրկնվող տարրեր են։ Էս պայմանը նախօրոք պետք չի վալիդացիա անել
//Դուք պետքա ստուգեք, թե արդյոք 2-րդ զանգվածը պարունակվումա առաջինի մեջ թե չէ ու տպեք համապատասխան հաղորդագրություն։
//Օրինակ1:  Input -arr1 [5, 7, 8, 0, -2, 4]  arr2 [8, 0, -2], output - true։ Օրինակ 2: Input - arr1 [9, 1, -3, 4, 7], arr2 [1, -3, 8, 7]: Output - false
//3
package HW6;

import java.util.Scanner;
//ԿԻՍԱՏՏՏՏՏՏՏՏՏՏՏ
public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("num1");
        int num1 = scanner.nextInt();
        int [] array1 = new int[num1];

        System.out.println("num2");
        int num2 = scanner.nextInt();
        int [] array2 = new int[num2];

        System.out.println("array1 numbers");
        for (int i = 0; i < num1 ; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("array2 numbers");
        for (int i = 0; i < num2 ; i++) {
            array2[i] = scanner.nextInt();
        }


        if (array2.length < array1.length && array2.length>1){
            boolean isContain = true;
            for (int i = 0; i < array1.length ; i++) {
                for (int j = 0; j < array2.length ; j++) {
                    if (array1[i] != array2[j]){
                        isContain = false;
                        break;
                    }
                }
            }
            System.out.println(isContain);

        }

    }
}
