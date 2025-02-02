package hw21_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Complex {
    private final String address;
    private List<Building> buildings ;

    public Complex(String address, List<Building> buildings) {
        this.address = address;
        this.buildings = new ArrayList<>(buildings);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Objects.equals(address, complex.address) && Objects.equals(buildings, complex.buildings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, buildings);
    }

    public static String getComplexAddress(HashMap<Complex,String> complexHashMap,Complex complex)throws ComplexDoesNotFound{
        if (complexHashMap.containsKey(complex)) {
            return "Address : " + complexHashMap.get(complex);
        }else{
            throw new ComplexDoesNotFound("The complex is not found. Sorry!!!");
        }
    }
}
