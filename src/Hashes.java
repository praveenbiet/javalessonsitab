package src;

import java.util.*;

public class Hashes {
    public static void main(String[] args) {
        Hashtable<String,Integer>  Myhash = new Hashtable<>();
        Myhash.put("A", 1);
        Myhash.put("B", 2);
        Myhash.put("C", 3);
        Myhash.put("D", 4);
        Myhash.put("E", 5);

        System.out.println(Myhash);
        Myhash.remove("A");
        System.out.println(Myhash);
        System.out.println(Myhash.get("B"));
        System.out.println(Myhash.get("C"));
        System.out.println(Myhash.get("D"));
        System.out.println(Myhash.keys());
        System.out.println(Myhash.values());

    }
}
