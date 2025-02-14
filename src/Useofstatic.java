package src;

class Useofstatic {
    static int k = 10;
    static void info(){
        System.out.println(k);
        k++;

    }

}
class Staticdemo {
    public static void main(String[] args){
        Useofstatic s = new Useofstatic();
        s.k= 12;
        Useofstatic s1 = new Useofstatic();
        System.out.println(s1.k);
        s1.k = 21;
        System.out.println(s.k);
        s.info();
        s1.info();

    }
}