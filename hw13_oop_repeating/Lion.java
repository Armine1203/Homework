package hw13_oop_repeating;

public class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        System.out.println(getName() + " lion roars");
    }
    public void eat(){
        System.out.println(getName() + " lion eats meat");
    }

}
