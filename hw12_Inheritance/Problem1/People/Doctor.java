package hw12_Inheritance.Problem1.People;

public class Doctor extends Person {
    private String specialization;

    public Doctor(String firstName, String lastName, int age, String specialization) {
        super(firstName, lastName, age);
        this.specialization = specialization;
    }

    public Doctor() {
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
