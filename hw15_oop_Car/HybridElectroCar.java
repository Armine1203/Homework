package hw15_oop_Car;

public class HybridElectroCar extends Car{
    HybridElectroCar(String carModel) {
        super(carModel);
    }

    @Override
    public void startDriving() {
        System.out.println(carModel+" drives without using gas");
    }


}
