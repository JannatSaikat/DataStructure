package dataStractureHW;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println(arrayList.size());

        arrayList.add("Apple");
        arrayList.add("Bee");
        arrayList.add("Cat");

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList);
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList);

    }
}
