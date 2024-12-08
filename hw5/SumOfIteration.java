package HW5;//Ունեք double[] array. մեջը խառը դրական ու բացասական թվեր։ Ձեր խնդիրը հետևյալումա` սկսում եք իտերացիան առաջին էլեմենտից ու
//        եթե հերթական էլեմենտը դրական թիվա, իտերացիան մի քայլով եք առաջ տանում
//        եթե կանգնում եք բացասական թվի վրա, ուրեմն իտերացիան 2 քայլով եք առաջ տանում
//        Եթե կանգնում եք 0-ի վրա, պետքա տեղում դուրս գաք ցիկլից
//        Վերջում պետքա տպեք բոլոր էն թվերի գումարը, որոնց վրայով անցել եք իտերացիաների ընթացքում։

//2
public class SumOfIteration {
    public static void main(String[] args) {
        double[] array1 = {-5, -5, -5, -5, 5, 5};
        double sum = 0;
        for (int i = 0; i < array1.length; ) {

            if (array1[i] > 0 ) {
                sum = sum + array1[i];
                if (i+1 >= array1.length){
                    break;
                }else{
                    i ++;
                }
            }else if (array1[i] < 0) {
                sum = sum + array1[i];
                if (i+2 >= array1.length){
                    break;
                }else {
                    i += 2;
                }
            }else if (array1[i] == 0) {
                break;
            }
        }

        System.out.println("sum = " + sum);
    }
}
