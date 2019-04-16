package dataStractureHW;

import java.util.ArrayList;
import java.util.Random;

public class SecretSanta {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Amit");
        list.add("Babu");
        list.add("Shakil");
        list.add("Sharu");
        list.add("Tamim");
        list.add("Rakib");
        list.add("Shawon");

String secretSantaOf = "Amit";
list.remove(secretSantaOf);

        Random r = new Random();
        int index = r.nextInt(list.size());
        String secret = list.get(index);
        System.out.println("family: " + list);
        System.out.println(secretSantaOf + "'s secret santa is: " + secret);



    }
}
