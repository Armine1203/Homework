package hw16_OOP_HeatingSystem;

public class Main {
    public static void main(String[] args) {
        Building apartment = new Apartment(150);
        GasBoiler gasBoiler = new GasBoiler("Boiler1",15,30,35,0.5,0.7);
        System.out.println(gasBoiler.calculateMonthlyGasCost(2,150));
        System.out.println(gasBoiler.calculateMonthlyElectricityCost(2,150));
        HeatingSystem heatingSystem = new HeatingSystem(apartment,gasBoiler);
        System.out.println(heatingSystem.calculateMonthlyHeatingCost(2));
    }
}
