package hw18_RecursionForBinaryNumbers;

public class DecimalToBinaryDemo {
    public static void main(String[] args) {
        try {
            System.out.println(Binary.decimalToBinary(1));
            System.out.println();
//            System.out.println(Binary.decimalToBinary(-41));
            System.out.println(Binary.decimalToBinary(0));
            System.out.println();
            System.out.println(Binary.decimalToBinary(5));
            System.out.println();
        }catch (ArithmeticException arithmeticException){
            System.out.println("The number cannot be less than 0");
        }
    }
}
