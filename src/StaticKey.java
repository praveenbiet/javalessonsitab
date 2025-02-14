package src;

public class StaticKey {
    int k = 10;


    void roo(){
        System.out.printf("%d",k);
        k = 29;
        System.out.printf("\n");

    }
    void foo(){

        System.out.printf("%d",k);
        System.out.printf("\n");
        roo();

    }
}
class demo{
    public static void main(String[] args){
        StaticKey s = new StaticKey();
        s.foo();
    }
}