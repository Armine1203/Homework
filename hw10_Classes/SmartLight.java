package hw10_Classes;

public class SmartLight {
    private boolean isOn;
    private int brightness;
    private String color;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Invalid brightness value. Please enter again!");
            System.exit(3);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toggle() {
        this.isOn = !this.isOn;
    }

    SmartLight(boolean isOn, int brightness, String color) {
        this.setOn(isOn);
        this.setBrightness(brightness);
        this.setColor(color);
    }


}
