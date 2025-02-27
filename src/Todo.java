package src;
interface aint{
    void  nothing();
}
interface  xint extends aint{
    void options();
}
interface yint extends aint{
    void print();
}
interface Todo extends xint,yint{
    int i = 15;
    void  create();
    void read();
    void update();
    void delete();
    void nothing();
}
class Interclass implements Todo{

    public void options() {
        System.out.println("i have options");

    }
    public void print(){
        System.out.println("nothing to print");

    }

    public void create(){
        System.out.println("i have created");
    }
    public void read(){
        System.out.println("i have read");

    }
    public  void update(){
        System.out.println("i have updated");

    }
    public  void  delete(){
        System.out.println("i have deleted");

    }

    @Override
    public void nothing() {

    }
}
class Interdemo {
    public static void  main(String[] args){
        Interclass iobj = new Interclass();
        iobj.create();
        iobj.delete();
        iobj.update();
        iobj.read();
        System.out.println(iobj.i);
//        iobj.i = 46;
//        System.out.println(iobj.i);
    iobj.options();
    iobj.print();
    iobj.nothing();
    }
}