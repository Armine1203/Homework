package hw16_OOP_HeatingSystem;

public class HeatingSystem {
    Boiler boiler;
    Building building;

   public HeatingSystem(Building building , Boiler boiler){
       this.building = building;
       this.boiler = boiler;
   }

    public double calculateMonthlyHeatingCost(int month) {
        double gasCost = boiler.calculateMonthlyGasCost(month, building.area);
        double electricityCost = boiler.calculateMonthlyElectricityCost(month, building.area);
        return gasCost + electricityCost;
    }
}
