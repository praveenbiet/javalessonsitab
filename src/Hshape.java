package src;
class Base1 {

    int d = 15;
    Base1(){
        System.out.println("Base1 constructor");
    }
}
class D1 extends Base1{
    D1(){
        System.out.println("D1 constructor");
        System.out.println(d);
    }
}
class D2 extends Base1{
    D2(){
        System.out.println("D2 constructor");
        System.out.println(d);
    }
}
public class Hshape {
    public static void main(String[] rahul){
        D1 d1obj = new D1();
        D2 d2obj = new D2();
    }
}
