package src;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> sobj = new Stack<>();
        sobj.push(1);
        sobj.push(2);
        sobj.push(3);
        sobj.push(4);
        sobj.push(5);
        sobj.pop();
        System.out.println(sobj);
        sobj.push(6);
        System.out.println(sobj);
        System.out.println(sobj.peek());
        for(Integer i : sobj){
            System.out.println(i);
        }
        System.out.println(sobj.capacity());
        System.out.println(sobj.size());
        for (int i = 0; i < sobj.size(); i++) {
            System.out.println(sobj.get(i));
        }


    }
}
