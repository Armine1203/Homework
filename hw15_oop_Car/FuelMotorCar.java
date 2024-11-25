package hw15_oop_Car;

public class FuelMotorCar extends Car implements GasPowered{
    FuelMotorCar(String carModel) {
        super(carModel);
    }
       @Override
    public void switchToGas(boolean inGas) {
        super.inGas = inGas;
    }


    @Override
    public void startDriving() {
        if (inGas){
            System.out.println(carModel+" drives using gas");
        }else {
            System.out.println(carModel+" drives without using gas");
        }
    }
}
