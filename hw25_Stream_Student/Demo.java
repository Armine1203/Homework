package hw25_Stream_Student;

import hw14_oop_IT.Main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
//todo  Գեներացնել 20 ուսանողի ցուցակ պատահական տվյալներով (օգտագործեք մեթոդ նրանց գեներացնելու համար)։
        System.out.println("task1 The random generated students list");
        List<Student> students = Student.generateStudentsList(20);
        students.forEach(x -> System.out.println(x));
        System.out.println();
/*
todo
        Գտնել և տպել այն ուսանողների անունները, ովքեր համապատասխանում են հետևյալ չափանիշներին՝
            -Նրանց տարիքը 18-ից 22-ի սահմաններում է։
            -Նրանց գնահատականը 60-ից 80-ի սահմաններում է։
*/
        System.out.println("task2 The students name which age between 18-22 and grade between 60-80");
        Student.filterStudentsBasedOnAgeAndGrade(students);
/*
todo
        Ստեղծել ուսանողների ցուցակ, որոնց գնահատականները բարձրացված են 15%-ով, բայց համոզվել, որ ոչ մի գնահատական չի գերազանցում 80-ը։
 */
        System.out.println("task3 The grade was increased 15 percent and is not more than 80 ");
        List<Student> studentList1 = Student.increaseGrade(students, 15)
                .stream().
                filter(student -> student.getGrade() <= 80).toList();

        studentList1.forEach(System.out::println);
        System.out.println();
/*
todo
        Ուսանողներին խմբավորել ծննդյան տարվա հիման վրա և տպել յուրաքանչյուր տարում ուսանողների քանակը։
 */
        System.out.println("task4 Group the students based on the birth year and print the counts of students for each year");
        Map<Integer,Integer> map = new HashMap<>();
        System.out.println(Student.groupStudentsBasedOnTheBirthYearAndPrintTheCountsOfStudentsForEachYear(students,map));
        System.out.println();
/*
todo
        Գտնել և հաշվարկել 20 և բարձր տարիք ունեցող ուսանողների միջին գնահատականը։ Արդյունքը մշակել Optional-ով։
 */
        System.out.println("Average "+Student.printAverageGrade(students));
        System.out.println();
/*
todo
        Ստուգել՝ արդյո՞ք բոլոր ուսանողների գնահատականները 45-ից բարձր են, և տպել արդյունքը։
 */
        System.out.println("All grades are more than 45: "+Student.checkAllGradesMoreThan45(students));
        System.out.println();
/*
todo
        Գտնել ամենացածր գնահատական ունեցող ուսանողին և տպել։
 */
        System.out.println("the student with lowest grade " );
        System.out.println(students.stream().min(Comparator.comparing(student -> student.getGrade())));
        System.out.println();
        /*
todo
        Ստեղծել ուսանողների անունների ստորակետերով բաժանված տող, որոնց անունները դասավորված են այբբենական կարգով, և տպել արդյունքը։
 */
        System.out.println("Students sorted String");
        System.out.println(Student.getSortedNames(students));
        System.out.println();
/*
todo
        Ֆիլտրել և ուսանողներին խմբավորել ըստ գնահատականների (60< , 60 - 70, > 70) և տպել խմբերը։
        Գտնել ամենաերիտասարդ ուսանողին
*/
        System.out.println("filtered list based on grades ");
        Map<Integer, List<Student>> filteredStudentsList = Student.groupStudentsBasedOnGrades(students);
        System.out.println(filteredStudentsList.get(1));//<60
        System.out.println(filteredStudentsList.get(2));//[60-70]
        System.out.println(filteredStudentsList.get(3));//70>


        System.out.println();
        System.out.println("The youngest student: ");
        System.out.print(students.stream().min(Comparator.comparing(student -> student.getAge())));
    }
}
