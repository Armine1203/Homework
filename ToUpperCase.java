import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        char char1 = 'b';
        //the difference between lowercase and uppercase letters is 32.
        //example a-97 A-65
        char upperCase = (char) (char1 - 32);
        System.out.println(upperCase);

    }
}
