package hw25_Stream_Student;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int age;
    private double grade;
    private int birthYear;

    public Student(String name, int age, double grade, int birthYear) {
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

    public int getBirthYear() {
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

    private static List<String> studentNames = Arrays.asList("Davit", "Tigran", "Vardan", "Narek", "Martik", "Hayk", "Hrant", "Alina", "Anna", "Monika", "Lilit", "Hamest", "Irina");

    private static Student generateStudent() {
        Random random = new Random();
        String name = studentNames.get(random.nextInt(studentNames.size()));
        int age = random.nextInt(30) + 16;//ամենաշատը 45
        double grade = random.nextDouble(60) + 41;
        int birthYear = 2025 - age;
        return new Student(name, age, grade, birthYear);
    }

    public static List<Student> generateStudentsList(int lengthOfList) {
        List<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < lengthOfList; i++) {
            studentsList.add(generateStudent());
        }
        return studentsList;
    }

    public static void filterStudentsBasedOnAgeAndGrade(List<Student> students) {
        students.stream().
                filter(student -> student.getAge() >= 18 && student.getAge() <= 22 && student.getGrade() >= 60 && student.getGrade() <= 80).
                map(student -> student.getName()).
                forEach(System.out::println);
    }

    public static List<Student> increaseGrade(List<Student> students, int percent) {
        students.forEach(student -> student.setGrade(student.getGrade() + student.getGrade() * percent / 100));
        return students;
    }

    public static Map<Integer, Integer> groupStudentsBasedOnTheBirthYearAndPrintTheCountsOfStudentsForEachYear(List<Student> students, Map<Integer, Integer> map) {
        students.stream().forEach(student -> {
            int count = 1;
            if (map.containsKey(student.getBirthYear())) {
                count++;
            }
            map.put(student.getBirthYear(), count);

        });
        return map;
    }

    public static OptionalDouble printAverageGrade(List<Student> students) {
        return students.stream().filter(student -> student.getAge() >= 20).mapToDouble(student -> student.getGrade()).average();
    }

    public static boolean checkAllGradesMoreThan45(List<Student> students) {
        return students.stream().allMatch(student -> student.getGrade() > 45);
    }

    public static String getSortedNames(List<Student> students) {
        return students.stream().map(student -> student.getName()).sorted().collect(Collectors.joining(", "));

    }

    public static Map<Integer, List<Student>> groupStudentsBasedOnGrades(List<Student> students) {
        List<Student> list1 = students.stream().filter(student -> student.getGrade() < 60).toList();
        List<Student> list2 = students.stream().filter(student -> student.getGrade() >= 60 && student.getGrade() <= 70).toList();
        List<Student> list3 = students.stream().filter(student -> student.getGrade() > 70).toList();
        Map<Integer, List<Student>> map = new HashMap<>();
        map.put(1,list1);
        map.put(2,list2);
        map.put(3,list3);
        return map;
    }
}
