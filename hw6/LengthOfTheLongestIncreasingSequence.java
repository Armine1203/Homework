//Գրել ծրագիր, որը կգտնի տվյալ զանգվածում ամենաերկար աճող հաջորդականության երկարությունը։
//        Օրինակ1:  [3, 4, 5, 2, 7, 8, 9], output: 3, որովհետև ամենաերկար հաջորդականությունը 2,7,8,9-նա, որի երկարությունը 3-ա
//        Օրինակ2: [5,9, -2, -3, 7], output: 1, որովհետև 5,9-ը ամենաերկար հաջորդականություննա։
//4
package HW6;

public class LengthOfTheLongestIncreasingSequence {
    public static void main(String[] args) {

        int [] array = {1,-5,25,58,0,-59};
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1]< array[i]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }


        if (currentLength > maxLength) {
            maxLength = currentLength;
        }

        System.out.println(maxLength);


    }
}
