package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Collections {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Jack");
        names.add("James");
        System.out.println(names);
        for (String name : names) {
            System.out.println(name);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        LinkedList<String> namez = new LinkedList<>();
        namez.add("John");
        namez.add("Jane");
        namez.add("Bob");
        namez.add("Jack");
        namez.add("James");
        System.out.println(namez);
        for (String name : namez) {
            System.out.println(name);
        }
        for (int i = 0; i < namez.size(); i++) {
            System.out.println(namez.get(i));
        }



    }


}
