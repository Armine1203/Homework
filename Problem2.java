public class Problem2 {
    public static void main(String[] args) {
        double double1 = 123.6;
        double double2 = 27.5;
        double double3 = 50.7;

        //1
        int sumInt = (int) (double1 + double2 + double3);
        System.out.println(sumInt);

        //2
        double sumDouble = double1 + double2 + double3;
        System.out.println(sumDouble);

        double tenthPart = sumDouble - sumInt;
        System.out.println(tenthPart);

        //3
        int sumOfIntegersParts = (int)double1 + (int)double2 + (int)double3;
        System.out.println(sumOfIntegersParts);
    }
}
