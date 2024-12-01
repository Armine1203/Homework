package hw16_OOP_HeatingSystem;

public abstract class Boiler {
    public String brand;
    public int volumeOfWater;
    public int percentOfEnergySaving;
    public int waterPressureRegulation;

    public Boiler(String brand, int volumeOfWater, int percentOfEnergySaving, int waterPressureRegulation) {
        this.brand = brand;
        this.volumeOfWater = volumeOfWater;
        this.percentOfEnergySaving = percentOfEnergySaving;
        this.waterPressureRegulation = waterPressureRegulation;
    }

    public abstract double calculateMonthlyGasCost(int month, int houseArea);
    public abstract double calculateMonthlyElectricityCost(int month, int houseArea);


}
