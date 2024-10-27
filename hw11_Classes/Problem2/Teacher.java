package hw11_Classes.Problem2;

public class Teacher {
    private static double k;
    private static double minSalary;
    private static double minBaseSalary;

    private String fullName;
    private int age;
    private String subject;
    private double wCoefficient;
    private double salary;

    static {
        setK(0.5);
        setMinSalary(25000);
        minBaseSalary = getK() * getMinSalary();
        System.out.println("Min base salary = "+ minBaseSalary);
    }

    public Teacher(String fullName, int age, String subject, double wCoff) {
        this.setFullName(fullName);
        this.setAge(age);
        this.setSubject(subject);
        this.setwCoefficient(wCoff);
        this.setSalary(wCoefficient);

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static double getK() {
        return k;
    }

    public static void setK(double k) {
        if (k > 1 || k < 0) {
            System.out.println("The coefficient k cannot be greater than 1 and less than 0");
            System.exit(5);
        } else {
            Teacher.k = k;
        }
    }

    public double getSalary() {
        salary = getwCoefficient() * minBaseSalary;
        return salary;
    }

    public void setSalary(double wCoefficient) {
        this.salary = minBaseSalary * wCoefficient;
    }

    public static double getMinSalary() {
        return minSalary;
    }

    public static void setMinSalary(double minSalary) {
        Teacher.minSalary = minSalary;
    }

    public static double getMinBaseSalary() {
        return minBaseSalary;
    }

    public static void setMinBaseSalary(double minBaseSalary) {
        Teacher.minBaseSalary = minBaseSalary;
    }

    public double getwCoefficient() {
        return wCoefficient;
    }

    public void setwCoefficient(double wCoefficient) {
        if (wCoefficient > 1 || wCoefficient < 0) {
            System.out.println("The coefficient w cannot be greater than 1 and less than 0");
            System.exit(5);
        } else {
            this.wCoefficient = wCoefficient;
        }
    }
}

