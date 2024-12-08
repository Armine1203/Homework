package hw18_RecursionForBinaryNumbers;

public class Binary {
    public static String decimalToBinary(int decimalNumber)throws NegativeNumbersException{
        if (decimalNumber == 0){
            return "0";
        }
        if (decimalNumber == 1){
            return "1";
        }
        if (decimalNumber < 0){
            throw new NegativeNumbersException("The number cannot be less than 0");
        }
        String binary = decimalToBinary(decimalNumber / 2) + (decimalNumber % 2);
        System.out.println(binary);
        return  binary;
    }
}
