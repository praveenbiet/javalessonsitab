package src;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(5,5);
        System.out.println(v.capacity());

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println(v.capacity());

        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);

        System.out.println(v.capacity());
        v.add(51);
        System.out.println(v.capacity());
        System.out.println(v.size());
        v.remove(1);
        System.out.println(v.capacity());
        System.out.println(v.size());
        v.trimToSize();
        System.out.println(v.capacity());
        System.out.println(v.size());

    }
}
