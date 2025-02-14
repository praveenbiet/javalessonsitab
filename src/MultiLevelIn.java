package src;
class A {
    int k = 10;
    A(){
        System.out.println("A constructure");
    }
    void info(){
        System.out.println(k);
    }
}
class B  extends A{
    B(){
        System.out.println("B constructure");

        System.out.println(k);
        k = 15;
    }
}
class C  extends B{
    C(){
        System.out.println("C constructure");
        System.out.println(k);
    }
}


public class MultiLevelIn {
    public static void main(String[] io){
        C sobj = new C();
    }

}
