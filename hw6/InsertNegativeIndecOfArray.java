//Ունեք խառը թվերով լցված զանգված։ Զանգվածի առաջին բացասական թվից հետո պետքա insert անեք նոր թիվ՝
//տվյալ բացասական էլեմենտի ինդեքսը։ Կրկնում եմ՝ insert, ու ոչ թե replace. Դրանից կախված թե ոնց
//պետքա հիշողության մեջ array վերցնեք, անհրաժեշտության դեպքում ոնց փոխեք տվյալ անունով
//array-ի չափը և այլն, ձեր գործնա։ Օրինակ input - [4, 7, 9, -2, 1, -1], output
// [4, 7, 9, -2, 3, 1, -1, 5]: Կամ input [4, 0, 6, 12], output - [4, 0, 6, 12]
//2
package HW6;
public class InsertNegativeIndecOfArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 7, 9, 2, -1, 1};
//                   [4, 7, 9, -2, 3, 1, -1]

        int index = -1;
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i]<0){
                index = i;
                break;
            }
        }

        if (index >= 0){
            int [] secondArray = new int[arr1.length + 1];
            secondArray[index] = index;
            for (int i = 0; i < secondArray.length ; i++) {
                if (i == index){
                    continue;
                } else if (i > index) {
                    secondArray[i] = arr1[i-1];
                }
               else secondArray[i] = arr1[i];
            }

            for (int i = 0; i < secondArray.length ; i++) {
                System.out.print(secondArray[i] + " ");
            }
        }
    }
}
