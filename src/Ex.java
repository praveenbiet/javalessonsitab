package src;

public class Ex {
    Ex() {

        int a = 5;
        int b = 0;
        try{


            int[ ] array = new int[1];
            array[0] = 2;

            System.out.println(array[1]);
            throw new ArrayIndexOutOfBoundsException("error");
            //System.out.println(a/b);

        }
        catch (ArithmeticException e){
            System.out.println("ohh noo error occured");

            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you are accessing outofindexvalue");

            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("error occured");

            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("definite");
        }

    }
}

class Exdemo{
    public static void main(String[] args) throws Exception {
        Ex eobj = new Ex();
    }
}
