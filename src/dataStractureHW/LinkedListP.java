package dataStractureHW;

import java.util.LinkedList;

public class LinkedListP {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.add("apple");
        linkedList.add("bat");
        linkedList.add("cat");
        linkedList.add(4);

        System.out.println(linkedList.size());
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.remove(1));
        System.out.println(linkedList);


    }
}
