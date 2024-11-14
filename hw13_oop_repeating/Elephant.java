package hw13_oop_repeating;

public class Elephant extends Animal implements PerformTrick{
   public Elephant(String name, int age){
       super(name,age);
   }

    public void makeSound() {
        System.out.println(getName() + " elephant trumpets");
    }

    public void eat() {
        System.out.println(getName() + " elephant eats grass.");
    }
    public void performTrick(){
        System.out.println(getName() + " elephant performs a trick.");
    }
}
