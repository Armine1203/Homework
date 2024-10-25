package hw11_Classes.Problem2;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Beniamin Franklin",25,"Chemestry",0.8);
        teacher.setK(25);
        Teacher.setMinSalary(355);
        System.out.println(Teacher.getMinSalary());
        System.out.println(teacher.getwCoefficient());
        
    }
}
