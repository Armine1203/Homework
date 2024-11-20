package hw13_oop_repeating;

public class Monkey extends Animal implements PerformTrick{
    Monkey(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        System.out.println(getName() + " monkey whoops");
    }
    public void eat(){
        System.out.println(getName()+" monkey eats banana");
    }
    public void performTrick(){
        System.out.println(getName() + " monkey performs a trick.");
    }


}
