package HW8;

public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.println(convertTemperature(45));
        System.out.println(convertTemperature(45, true));
    }

    static double convertTemperature(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    static double convertTemperature(double fahrenheit, boolean isFahrenheit) {
        if (isFahrenheit) {
            double celsius = (fahrenheit - 32) * 5 / 9;
            return celsius;
        } else {
            throw new IllegalArgumentException("Invalid value: Expected value of temperature is in Fahrenheit.");
        }
    }

}
