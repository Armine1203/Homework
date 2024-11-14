package hw13_oop_repeating;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
                new Lion("Simba",5),
                new Monkey("Coco",2),
                new Elephant("Dumbo",5)
        };
        for ( Animal animal:animals) {
            animal.makeSound();
            animal.eat();
            if (animal instanceof PerformTrick){
                ((PerformTrick) animal).performTrick();
            }
            System.out.println("------------------------");

        }

    }
}
