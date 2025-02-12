package hw24_Student;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ann", 25, 100, "2000");
        Student student2 = new Student("Ann1", 18, 82, "2007");
        Student student3 = new Student("Ann2", 35, 97, "1990");
        Student student4 = new Student("Ann3", 20, 95, "2005");
        Student student5 = new Student("Ann4", 17, 60, "2008");

        List<Student> listOfStudents = List.of(student1, student2, student3, student4, student5);

        //Տպել ուսանողների տվյալները։
        System.out.println("Method reference");
        Student.processStudents(listOfStudents, System.out::println);

        System.out.println();

        System.out.println("LambDa");
        Student.processStudents(listOfStudents, student -> System.out.println(student));

        System.out.println();

        //Տպել միայն այն ուսանողների անունները, որոնց գնահատականը մեծ է 90-ից։
        System.out.println("more than 90");
        Student.processStudents(listOfStudents, student -> {
            if (student.getGrade() > 90) {
                System.out.println(student.getName());
            }
        });

        System.out.println();

//      -Բարձրացնել բոլոր ուսանողների գնահատականները 10%-ով։
        Student.processStudents(listOfStudents, student -> {
            student.setGrade(student.getGrade() + (student.getGrade() * 0.1));
            System.out.println(student);
        });


        System.out.println();

        //*** Օգտագործել Function ֆունկցիոնալ ինտերֆեյսը և Integer::parseInt,
        // որպեսզի փոխակերպեք birthYear-ը int և հաշվեք ուսանողի տարիքը։
        System.out.println("*** Ages");
        Function<Student, Integer> age = student -> 2025 - Integer.parseInt(student.getBirthYear());
        listOfStudents.forEach(student -> System.out.println(age.apply(student)));

    }
}
