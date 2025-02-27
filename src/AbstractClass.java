package src;

public abstract class AbstractClass {
    int x = 10;

    void print(){
        System.out.println(x);
    }
    abstract void whatisx();
}
class EAbclass extends AbstractClass{

    void whatisx(){

    }
}

class DemoAbs{
    public static void main(String[] hi){
       // AbstractClass Aobj = new AbstractClass();
        EAbclass Eobj = new EAbclass();
        Eobj.print();
        Eobj.x = 15;
        Eobj.print();
    }
}