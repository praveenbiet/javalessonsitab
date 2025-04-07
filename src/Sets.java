package src;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("A");
        System.out.println(set);

        LinkedList<String> list = new LinkedList<String>(set);
        System.out.println(list);
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(4);
        treeSet.add(3);
  System.out.println(treeSet);
    }
}
