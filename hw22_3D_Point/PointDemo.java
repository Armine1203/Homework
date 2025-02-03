package hw22_3D_Point;

import java.util.*;

public class PointDemo {
    public static void main(String[] args) {
        //--------------------------First part----------------------------------
        Map<Creator, Point3D> hashMapOfPoints = new HashMap<>();

        Point3D point1 = new Point3D(2, 1, 5, "green", "point1");//are different via point name
        Point3D point2 = new Point3D(2, 1, 5, "green", "point2");//are different via point name
        Point3D point3 = new Point3D(5, 6, 7, "red", "point3");
        Point3D point4 = new Point3D(8, 9, 10, "blue", "point4");
        Point3D point5 = new Point3D(2, 12, 11, "black", "point5");
        Point3D point6 = new Point3D(20, 41, 50, "yellow", "point6");

        hashMapOfPoints.put(new Creator("Ann"), point1);
        hashMapOfPoints.put(new Creator("Bob"), point2);
        hashMapOfPoints.put(new Creator("Alice"), point3);
        hashMapOfPoints.put(new Creator("Doe"), point4);
        hashMapOfPoints.put(new Creator("Ann2"), point5);
        hashMapOfPoints.put(new Creator("Bob2"), point6);

        System.out.println(hashMapOfPoints + "\n");

        Map<Creator, Point3D> treeMap = new TreeMap<Creator, Point3D>(hashMapOfPoints);
        System.out.println(treeMap + "\n");

//--------------------------Second part----------------------------------
        System.out.println(swapMap(treeMap) + "\n");//????????????????

        System.out.println(swapMap(hashMapOfPoints) + "\n");//????????????????????????????/

//--------------------------Third part----------------------------------
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(45);
        arrayList.add(45);
        arrayList.add(40);
        arrayList.add(55);

        System.out.println(countOfDuplicates(arrayList));
    }

    public static <K, V> Map<V, K> swapMap(Map<K, V> map) {
        Map<V, K> swappedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        return swappedMap;
    }


    public static Map<Integer, Integer> countOfDuplicates(List<Integer> list) {
        Map<Integer, Integer> mapOfData = new HashMap<>();

        for (int item : list) {
            if (mapOfData.containsKey(item)) {
                int count = mapOfData.get(item);
                mapOfData.put(item, count + 1);
            } else {
                mapOfData.put(item, 1);
            }

        }
        return mapOfData;
    }
}