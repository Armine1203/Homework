package hw19_ArrayList;


import java.util.ArrayList;

public class ArrayListFunctions {
    //2. Գրեք Generic մեթոդ, որը կընդունի ցանկացած տեսակի էլեմենտներ պարունակող ArrayList,
    // ու ևս մեկ արգումենտ՝ տվյալ arraylist-ի անդամների տիպի։
    // Ձեր մեթոդը պետքա ուղղակի ստուգի, թե արդյոք փոխանցվող էլեմենտը գոյություն ունի տվյալ arraylist-ում։
    // Կիրառեք մեթոդը նաև վերը նշված խնդրում Student կլասի օբյեկտների հավաքածուի համար։
    public static <T> boolean isContainedInArrayList(ArrayList<T> arrayList, T element) {
        return arrayList.contains(element);
    }

    //3. Ունեք մի arraylist, որի մեջ խառը ռացիոնալ թվեր են լցված՝ ամբողջ կամ կոտորակային մասով։
    // Ձեր խնդիրնա, պտտվել տվյալ arraylist-ի վրայով, առանձնացնել Integer-ներն ու ավելացնել նոր arraylist-ի մեջ,
    // որտեղ հենց պետքա պահվեն միայն ամբողջ թվեր։ Չօգտագործել instanceOf keyword-ը;
    public static ArrayList<Integer> getIntegerValues(ArrayList<Number> arrayList){
        ArrayList <Integer> newArraylist = new ArrayList<>();
        for (Number number : arrayList){
            if (number.doubleValue() == number.intValue()){
                newArraylist.add(number.intValue());
            }

        }
        return newArraylist;
    }
}
