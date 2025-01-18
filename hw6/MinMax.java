//Վերցնում եք ամբողջ թվերի զանգված։ Մի ցիկլով գտնում եք տվյալ զանգվածի միջի մինիմում ու մաքսիմում թվերը։
//Դիտարկում եք տարբեր corner case-եր նաև, որպեսզի վստահ լինեք, որ ճիշտա աշխատում։
//Օրինակ եթե array-ի մեջ բոլոր թվերը նույնն են, ուրեմն ձեր մինիմումն ու մաքսիմումը պիտի համընկնեն։
//1
package HW6;

public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {12, -45, 75, 0, -468, 85, 125};
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[i + 1]) {
                maximum = minimum;
            }
        }


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            } else if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);


    }
}
