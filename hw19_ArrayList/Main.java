package hw19_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        StudentGrades studentGrades1 = new StudentGrades("Ann", 5, 8, 9);
        StudentGrades studentGrades2 = new StudentGrades("Viliam", 2, 9, 4);
        StudentGrades studentGrades3 = new StudentGrades("Bob", 1, 4, 3);
        StudentGrades studentGrades4 = new StudentGrades("Selena", 6, 7, 9);

        ArrayList<StudentGrades> arrayList = new ArrayList<StudentGrades>();
        arrayList.add(studentGrades1);
        arrayList.add(studentGrades2);
        arrayList.add(studentGrades3);

        System.out.println("before sorting "+arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting "+arrayList);

        System.out.println("--------------");
        System.out.println(StudentGrades.compareStudentGrades(studentGrades1,studentGrades2));
        //2
        System.out.println(ArrayListFunctions.isContainedInArrayList(arrayList, studentGrades4));
        System.out.println(ArrayListFunctions.isContainedInArrayList(arrayList, studentGrades3));

        //3
        ArrayList<Number> numbers = new ArrayList<Number>();
        numbers.add(12.5);
        numbers.add(1);
        numbers.add(-5);
        numbers.add(75.2);
        numbers.add(10);
        numbers.add(33.3);
        numbers.add(45.8);
        numbers.add(8);
        numbers.add(-90);

        System.out.println("numbers: " + numbers);
        System.out.println("integer values: " + ArrayListFunctions.getIntegerValues(numbers));
    }
}