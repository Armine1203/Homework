import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = 'b';

        //փոքրատառերի ու մեծատառերի տարբերությունը 32 է։
        //օրինակ a-97 A-65
        char upperCase =(char)(char1-32);
        System.out.println(upperCase);

    }
}
