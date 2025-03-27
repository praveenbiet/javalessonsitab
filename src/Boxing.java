package src;

public class Boxing {

    public static void main(String[] args) {
        //autoboxing
        int i = 10;
        Integer j = i;
        // unboxing
        i = j;

        //autoboxing
        char c = 'p';
        Character ch = c;
        c = ch;
        System.out.println(i);
        System.out.println(j.compareTo(i));
        System.out.println(c);
        System.out.println(ch);

    }

}
