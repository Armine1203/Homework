//գրեք ծրագիր, որը կընդունի որպես input ցանկացած անգլերեն փոքրատառ ու
// որպես արդյունք կտպի դրա մեծատառը։
package HW3;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //the difference between lowercase and uppercase letters is 32.
        //example a-97 A-65
        //a-97 -> z-122
        System.out.println("Enter the symbol");
        char char1 = scanner.next().charAt(0);
//      char char1 = 'z';
        if (char1 >= 97 && char1 <= 122) {
            char upperCase = (char) (char1 - 32);
            System.out.println(upperCase);
        }else{
            System.out.println("Please enter lowercase");
            System.exit(0);
        }
    }
}
