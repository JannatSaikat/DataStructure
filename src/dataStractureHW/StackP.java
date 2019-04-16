package dataStractureHW;

import java.util.Stack;

public class StackP {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.add("apple");
        stack.add("bat");
        stack.add("cat");
        stack.add(4);

        System.out.println(stack.size());
        System.out.println(stack.get(2));
        System.out.println(stack.remove(1));
        System.out.println(stack);
        System.out.println(stack.search(4));
        System.out.println(stack.search(5));
        System.out.println(stack.search("cat"));
    }

}
