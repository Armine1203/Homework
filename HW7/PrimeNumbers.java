//Ունեք զանգված, որի մեջ կան տարբեր դրական ամբողջ թվեր. հեշտության համար array-ը ուղիղ հայտարարեք ու ինիցալիզացրեք կոդի մեջ։
//Ձեզնից պահանջվումա գրել ծրագիր, որը կստուգի array-ի հերթական անդամի պարզ լինել-չլինելը ու կտպի համապատասխան հաղորդագրություն։
//Յուրաքանչյուր անդամի պարզ լինել-չլինելը պետքա ստուգբի առանձին մեթոդով։
//Նորից եմ շեշտում, յուրաքանչյուր թվի ստուգելը պետքա լինի առանձին մեթոդով, ոչ թե ամբողջ array-ինը։
//Ձեր մեթոդը պետքա վերադարձնի սխալա թե ճիշտ, որ array-ի հերթական թիվը պարզա։
//1

package HW7;
public class PrimeNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 0, 4};

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is prime number");
            } else {
                System.out.println(arr[i] + " is not prime number");
            }

        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
