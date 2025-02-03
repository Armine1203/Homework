package hw22_3D_Point;

public class Creator implements Comparable<Creator> {
    private String name;
    public Creator(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "name='" + name + '\'' +
                '}'+" ";
    }

    @Override
    public int compareTo(Creator o) {
        return this.name.compareTo(o.name);
    }
}
