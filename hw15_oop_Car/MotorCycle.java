package hw15_oop_Car;

public class MotorCycle extends Car {
    MotorCycle(String carModel) {
        super(carModel);
    }

    @Override
    public void startDriving() {
        System.out.println(carModel+" drives using a gasoline.");
    }
}
