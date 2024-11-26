package hw15_oop_Car;

public class Main {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle("MotorCycle1");
        motorCycle.printCarModel();
        motorCycle.startDriving();

        System.out.println();

        DieselMotorCar dieselCar = new DieselMotorCar("DieselMotorCar1");
        dieselCar.printCarModel();
        dieselCar.switchToGas(false);
        dieselCar.startDriving();
        dieselCar.switchToGas(true);
        dieselCar.startDriving();

        System.out.println();

        FuelMotorCar fuelCar = new FuelMotorCar("FuelCar1");
        fuelCar.printCarModel();
        fuelCar.switchToGas(false);
        fuelCar.startDriving();
        fuelCar.switchToGas(true);
        fuelCar.startDriving();

        System.out.println();

        HybridElectroCar hybridCar = new HybridElectroCar("HybridCar1");
        hybridCar.printCarModel();
        hybridCar.startDriving();
    }
}
