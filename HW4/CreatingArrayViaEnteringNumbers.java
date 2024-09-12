/*
ետքա ներմուծեք n ամբողջ թիվ՝ դրա հիման վրա մասիվ ստանալու համար.
Եթե n-ը 3-ա, ուրեմն array-ի չափն էլ պետքա լինի 3
Եթե 4-ա, ուրեմն 4
Եթե 5-ա, ուրեմն 5
Եթե 6-ա, կամ 7, ուրեմն չափը պետքա լինի 10
Մնացած բոլոր դրական թվերի դեպքերում պետքա լինի 15 ու իրա առաջին անդամի արժեքն էլ հենց 15։
Խնդիրը լուծելուց չեք օգտագործում պայմանի օպերատոր։
*/
package HW4;

import java.util.Scanner;

public class CreatingArrayViaEnteringNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array;


        if (number > 0) {
            switch (number) {
                case 3:
                    array = new int[3];
                    break;
                case 4:
                    array = new int[4];
                    break;
                case 5:
                    array = new int[5];
                    break;
                case 6:
                case 7:
                    array = new int[10];
                    break;
                default:
                    array = new int[15];
                    array[0] = 15;
            }
        }else {
            System.exit(0);
        }


    }
}
