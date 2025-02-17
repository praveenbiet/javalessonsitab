package src;

class Out{
    private int x =15;
    Out(){
        System.out.println("Out constructor");

    }
    class In{
        int y = x;
        In(){
            System.out.println("in constructor");
            info();
        }
    }
    private void info(){
        System.out.println(x);
    }
}

public class OutInclass {
    public static void main(String[] args){
        Out Oobj = new Out();
        Out.In inobj = Oobj.new In();
        //System.out.println(Oobj.x);
        System.out.println(inobj.y);
    }
}
