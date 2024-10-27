package hw12_Inheritance.Problem1.Buildings;

public class Building {
    private int drainageSystem ;
    private int voltage ;

    public Building(){}
    public Building(int drainageSystem, int voltage) {
        this.setDrainageSystem(drainageSystem);
        this.setVoltage(voltage);
    }

    public int getDrainageSystem() {
        return drainageSystem;
    }

    public void setDrainageSystem(int drainageSystem) {
        this.drainageSystem = drainageSystem;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
}
