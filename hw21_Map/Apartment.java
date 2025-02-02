package hw21_Map;

import java.util.Objects;

public class Apartment {
    private final int rooms;
    private final double area;
    private final boolean hasBalcony;
    private final int floor;

    public Apartment(int rooms, double area, boolean hasBalcony, int floor) {
        this.rooms = rooms;
        this.area = area;
        this.hasBalcony = hasBalcony;
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return rooms == apartment.rooms &&
                Double.compare(area, apartment.area) == 0 &&
                hasBalcony == apartment.hasBalcony &&
                floor == apartment.floor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, area, hasBalcony, floor);
    }
}
