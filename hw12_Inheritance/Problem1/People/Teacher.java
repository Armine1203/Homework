package hw12_Inheritance.Problem1.People;

import hw12_Inheritance.Problem1.People.Person;

public class Teacher extends Person {
    private String subject;


    public Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }
    public Teacher(){
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
