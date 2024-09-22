//Գրեք մեթոդ, որը կընդունի ամբողջ թվերի զանգված։ Ձեր խնդիրնա գտնել մեթոդին փոխանցված array-ում դրական ու բացասական
//թվերի հարաբերակցությունը` positive / negative, ու վերադարձնել տվյալ double թիվը։ Եթե չլինեն բացասական թվեր, թող վերադարձնի -1։
//3
package HW7;
public class RatioOfPositiveAndNegativeNumbers {
    public static void main(String[] args) {

        int [] array = {-2,-8,8};
        System.out.println(printPositiveAndNegativeNumbers(array));
    }
    static double printPositiveAndNegativeNumbers(int [] array){
        int positiveNumbersCount = 0;
        int negativeNumbersCount = 0;
        double ratio;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                negativeNumbersCount++;
            }else {
                positiveNumbersCount++;
            }
        }
        System.out.println("positiveNumbersCount " + positiveNumbersCount);
        System.out.println("negativeNumbersCount " + negativeNumbersCount);
        ratio = (double) positiveNumbersCount / negativeNumbersCount;
        return ratio;
    }
}
