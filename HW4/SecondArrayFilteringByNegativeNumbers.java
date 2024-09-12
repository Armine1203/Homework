/*
Պատկերացրեք ունեք ֆիքսված 5 չափանի մասիվ, մեջը կարաք միանգամից սկզբնարժեքավորեք խառը double թվերով։
Պետքա ստանաք դրանից մի այլ մասիվ, որը բաղկացած կլինի առաջինի՝ միայն ոչ բացասական թվերից։
2-րդ զանգվածի էլեմենտներին վերագրումը պետքա լինի հակառակ հերթականությամբ՝ վերջից սկիզբ։
Եթե չվերագրված տեղեր մնան 2-րդ զանգվածում, ուրեմն թող լցվեն 0-ով։
Խնդիրը պետքա աշխատի 5 չափանի մասիվում բացասական ու ոչ բացասական թվերի ցանկացած քանակության դեպքում։
 */
package HW4;

public class SecondArrayFilteringByNegativeNumbers {
    public static void main(String[] args) {
        double[] array1 = {10.5, 7.8, 2.3, 3, 8};
        double[] array2 = new double[5];

        if (array1[0] > 0) {
            array2[array2.length - 1] = array1[0];
        }
        if (array1[1] > 0) {
            array2[array2.length - 1 - 1] = array1[1];
        }
        if (array1[2] > 0) {
            array2[array2.length - 1 - 2] = array1[2];
        }
        if (array1[3] > 0) {
            array2[array2.length - 1 - 3] = array1[3];
        }
        if (array1[4] > 0) {
            array2[array2.length - 1 - 4] = array1[4];
        }

        System.out.println("Array: " + array2[0] + ", " + array2[1] + ", " + array2[2] + ", " + array2[3] + ", " + array2[4]);


    }
}
