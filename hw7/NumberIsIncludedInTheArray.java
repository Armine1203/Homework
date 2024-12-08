//Մի հատ էլ պարզ խնդիր. պիտի գրեք մեթոդ, որը կստանաս ամբողջ թվերի array ու ևս մեկ՝
//array-ի տիպն ունեցող պարամետր։ Ձեր մեթոդը պետքա վերադարձնի true,
//եթե էդ թիվը պարունակվումա array-ի մեջ, ու false, եթե չի պարունակվում։
//5
package HW7;
public class NumberIsIncludedInTheArray {
    public static void main(String[] args) {
        int [] array = {0,-5,-8,-9,10};
        int number = -7;
        System.out.println(number+ " is included in array - " + numberIsIncludedInArray(array, number));

    }
    static boolean numberIsIncludedInArray(int [] array , int number){
        boolean isIncluded = false;
        for (int i = 0; i < array.length  ; i++) {
            if (number == array[i]){
                isIncluded = true;
            }
        }

        return isIncluded;

    };
}
