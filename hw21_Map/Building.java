package hw21_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Building {
    public final int floorsCount;
    public final int countOfParkings;
    public final List<Apartment> apartments;

    public Building(int floorsCount, int countOfParkings, List<Apartment> apartments) {
        this.floorsCount = floorsCount;
        this.countOfParkings = countOfParkings;
        this.apartments = new ArrayList<>(apartments);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return floorsCount == building.floorsCount && countOfParkings == building.countOfParkings && Objects.equals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorsCount, countOfParkings, apartments);
    }
}
