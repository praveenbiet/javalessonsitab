package src;

public class AccessSpecifiers {
    int x = 10;
    public int y =11;
    protected int z = 12;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    private int k = 13;
    void  info(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);
    }
}

class DemoAccess{
    public static void main(String[] praveen){
        AccessSpecifiers obj =new AccessSpecifiers();
        obj.info();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.getK());
    }
}