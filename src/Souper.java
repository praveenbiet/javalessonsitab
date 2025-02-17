package src;

class D{
    int  k;
    D(int k){
        this.k = k;
        System.out.println("D contructor");

    }
}
class O extends D{

    O(int k){
        super(k);
        System.out.println("o contructor");
    }
    void info(){
        System.out.println(k);

    }
}
public class Souper {
    public static void main(String[] op){
        O Oobj = new O(15);
        Oobj.info();
    }
}
