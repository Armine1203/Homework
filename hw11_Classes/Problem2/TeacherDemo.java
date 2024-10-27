package hw11_Classes.Problem2;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Beniamin Franklin",25,"Chemestry",0.8);
        System.out.println(teacher.getwCoefficient());
        System.out.println(teacher.getSalary());

        Teacher teacher1 = new Teacher("John Doe",24,"Math", 1);
        System.out.println(teacher.getSalary());
    }
}
