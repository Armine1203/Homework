package hw21_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComplexDemo {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(4, 70.5, true, 5);
        Apartment apartment2 = new Apartment(2, 35.2, false, 2);
        Apartment apartment3 = new Apartment(4, 75.0, false, 1);
        Apartment apartment4 = new Apartment(3, 60.2, true, 3);
        Apartment apartment5 = new Apartment(5, 80.5, true, 3);

        Building building1 = new Building(10, 2, List.of(apartment1, apartment2));
        Building building2 = new Building(5, 0, List.of(apartment1, apartment2, apartment3));
        Building building3 = new Building(6, 1, List.of(apartment3, apartment2, apartment4));
        Building building4 = new Building(7, 3, List.of(apartment5, apartment4));
        Building building5 = new Building(8, 3, List.of(apartment4, apartment3));

        Complex complex1 = new Complex("Ankaxutyun", List.of(building1, building2));
        Complex complex2 = new Complex("Tumanyan", List.of(building3, building4));
        Complex complex3 = new Complex("Quchak", List.of(building5));

        HashMap<Complex, String> complexMap = new HashMap<>();
        // complexMap.put(complex1, "Ankaxutyun");
        complexMap.put(complex2, "Tumanyan");
        complexMap.put(complex3, "Quchak");

        System.out.println(Complex.getComplexAddress(complexMap, complex1));
        System.out.println(Complex.getComplexAddress(complexMap, complex2));

    }
}