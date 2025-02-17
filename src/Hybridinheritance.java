package src;
class HBase0{
    int c = 15;
    HBase0(){
        System.out.print("HBase0 constructor");
    }
}
class HBase1 extends HBase0{
    int d = 15;
    HBase1(){
        System.out.println("HBase1 constructor");
    }
}
class HD1 extends HBase1{
    HD1(){
        System.out.println("HD1 constructor");
        System.out.println(d);
        System.out.println(c);
    }
}
class HD2 extends HBase1{
    HD2(){
        System.out.println("HD2 constructor");
        System.out.println(d);
        System.out.println(c);

    }
}
public class Hybridinheritance {
    public static void main(String[] rahul){
        HD1 dh1obj = new HD1();
        HD2 dh2obj = new HD2();
    }
}
