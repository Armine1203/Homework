package hw16_OOP_HeatingSystem;

public class GasBoiler extends Boiler{
    private  double coefficientOfGasRate; //(0;1)
    private  double coefficientOfEnergyRate;


    public GasBoiler(String brand, int volumeOfWater, int percentOfEnergySaving, int waterPressureRegulation,double coefficientOfGasRate, double coefficientOfEnergyRate) {
        super(brand, volumeOfWater, percentOfEnergySaving, waterPressureRegulation);
        this.coefficientOfGasRate = coefficientOfGasRate;
        this.coefficientOfEnergyRate = coefficientOfEnergyRate;

    }

    @Override
    public double calculateMonthlyGasCost(int month, int houseArea) {
        int averageTemp = getAverageTemperatureForMonth(month);
        int temperatureDifferences = 25 - averageTemp;//25-ը համարենք նորմալ սենյակային ջերմաստիճան;
        double monthlyGasCost = coefficientOfGasRate * houseArea * temperatureDifferences * 31 ;
        return monthlyGasCost;
    }

    @Override
    public double calculateMonthlyElectricityCost(int month, int houseArea) {
        int averageTemp = getAverageTemperatureForMonth(month);
        int temperatureDifferences = 25 - averageTemp;
        double monthlyElectricityCost = coefficientOfEnergyRate * houseArea * averageTemp * 31 ;
        return monthlyElectricityCost;
    }

    public int getAverageTemperatureForMonth(int month) {
        switch (month) {
            case 1:
                return AverageTemperatures.MIDDLE_TEMPERATURE_JANUARY;
            case 2:
                return AverageTemperatures.MIDDLE_TEMPERATURE_FEBRUARY;
            case 3:
                return AverageTemperatures.MIDDLE_TEMPERATURE_MARCH;
            case 4:
                return AverageTemperatures.MIDDLE_TEMPERATURE_APRIL;
            case 5:
                return AverageTemperatures.MIDDLE_TEMPERATURE_MAY;
            case 6:
                return AverageTemperatures.MIDDLE_TEMPERATURE_JUNE;
            case 7:
                return AverageTemperatures.MIDDLE_TEMPERATURE_JULY;
            case 8:
                return AverageTemperatures.MIDDLE_TEMPERATURE_AUGUST;
            case 9:
                return AverageTemperatures.MIDDLE_TEMPERATURE_SEPTEMBER;
            case 10:
                return AverageTemperatures.MIDDLE_TEMPERATURE_OCTOBER;
            case 11:
                return AverageTemperatures.MIDDLE_TEMPERATURE_NOVEMBER;
            case 12:
                return AverageTemperatures.MIDDLE_TEMPERATURE_DECEMBER;
            default:
                System.out.println("Please try again! Incorrect month value");
                System.exit(5);
                return 0 ;
        }
    }
}
