package src;

public class inheritance {
    int k = 10;
    inheritance(){
        System.out.println("inheritance constructure");
    }
   private void info(){
        System.out.println(k);
    }
    void callprivateinfo(){
        info();
    }
}
class simpleinheritance  extends inheritance{
    simpleinheritance(){
        System.out.println(k);
        //info();//error
        callprivateinfo();
    }
}

class simpleinheritancedemo {
    public static void main(String[] io){
        simpleinheritance sobj = new simpleinheritance();
    }
}
