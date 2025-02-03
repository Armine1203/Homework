package hw22_3D_Point;

import java.util.Objects;

public class Point3D {
    private final int x;
    private final int y;
    private final int z;
    private final String color;
    private final String pointName;

    public Point3D(int x, int y, int z, String color, String pointName) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
        this.pointName = pointName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return x == point3D.x
                && y == point3D.y
                && z == point3D.z
                && Objects.equals(color, point3D.color)
                && Objects.equals(pointName, point3D.pointName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, color, pointName);
    }

    @Override
    public String toString() {
        return " Point3D{" +
                x + " " + y + " " + z + " " + color + " " + pointName +
                '}';
    }

}