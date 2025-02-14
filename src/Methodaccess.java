package src;

public class Methodaccess {
    void  info(){
        System.out.println("default Hello IT");

    }
    public void  info1(){
        System.out.println("public Hello IT");

    }
    protected void  info2(){
        System.out.println("protected Hello IT");

    }
    private void  info3(){
        System.out.println("private Hello IT");

    }
    public void foo(){
        info3();
    }
}

class DemoMethodAccess{
    public static void main(String[] praveen){
        Methodaccess obj =new Methodaccess();
        obj.info();
        obj.info1();
        obj.info2();
        //obj.info3(); // cant access directly
        obj.foo();
    }
}