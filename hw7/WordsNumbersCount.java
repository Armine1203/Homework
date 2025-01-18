//Ունեք սովորական String փոփոխական, որի մեջ անգլերեն տառերով տեքստա գրած պրոբելներով։։
//Դուք պիտի գրեք մեթոդ, որը կստանաս տվյալ String-ը որպես պարամետր ու կվերադարձնի String-ում բառերի քանակը։
//      Բառ համարվումա ցանկացած մինիմում >=1 տառ(եր)ի հաջորդականությունը
//      Պրոբելների քանակը կարա լինի 1-ից ավել տեքստի մեջ ցանկացած 2 բառի արանքում
//Լուծումը ստուգում եք տարբեր տեսքի տեքստերի համար։
//Ծրագիրը պիտի իտերացիա անի String-ի վրա, String-ի ստանդարտ մեթոդներից կարաք օգտագործեք իտերացիա անելու համար անհրաժեշտները՝
//String-ի երկարությունը վերցնելու մեթոդն ու հերթական ինդեքսի տակ գտնվող տառը վերցնելու համար նախատեսված մեթոդը, ոչ ավելին։
//4

package HW7;
public class WordsNumbersCount {
    public static void main(String[] args) {
        String string = "Armines  g  f  g w d xjkde";
        System.out.println(countOfWords(string));

    }
    public static int countOfWords(String string){
        int count = 0;
        boolean isWord = false;
        if (string.length()<1) {
            System.exit(0);
        }else {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != ' '){
                    if (!isWord) {
                        count++;
                        isWord = true;
                    }
                }
                else{
                    isWord = false;
                }
            }
        }

        return count;
    }
}
