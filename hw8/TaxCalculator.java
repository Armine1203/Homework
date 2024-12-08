package HW8;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println(calculateIncomeTax(1000));
        System.out.println(calculateIncomeTax(1000, 500));
        System.out.println(calculateIncomeTax(1000, true));
    }

    static double calculateIncomeTax(double grossSalary) {
        if (grossSalary <= 0) {
            System.out.println("Please enter a valid data");
            return 0;
        } else {
            double incomeTax = grossSalary - (grossSalary * 20 / 100);
            return incomeTax;
        }
    }

    static double calculateIncomeTax(double grossSalary, double taxRate) {
        if (grossSalary <= 0 || taxRate <= 0) {
            System.out.println("Please enter a valid data");
            return 0;
        } else {
            double incomeTax = grossSalary - taxRate;
            return incomeTax;
        }
    }

    static double calculateIncomeTax(double grossSalary, boolean isITWorker) {
        double incomeTax;
        if (grossSalary <= 0) {
            System.out.println("Please enter valid value");
            return 0;
        } else if (isITWorker == true) {
            incomeTax = grossSalary - (grossSalary * 10 / 100);
            return incomeTax;
        } else {
            incomeTax = grossSalary - (grossSalary * 20 / 100);
            return incomeTax;
        }
    }
}
