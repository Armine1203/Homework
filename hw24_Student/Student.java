package hw24_Student;

import java.lang.constant.Constable;
import java.util.List;
import java.util.function.Consumer;

public class Student {
    private String name;
    private int age;
    private double grade;
    private String birthYear;

    public Student(String name, int age, double grade, String birthYear) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }

    public static void processStudents(List<Student> students , Consumer<Student> consumer){
        students.forEach(consumer::accept);
    }

}
