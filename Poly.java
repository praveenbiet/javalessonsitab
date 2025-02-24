public class Poly {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    float add(float a, float b) {
        return a + b;
    }

    float add(float a, float b, float c) {
        return a + b + c;
    }
//    int add(int c, int d){
//            return c+d;
//        }
//}
}
    class Dpoly extends Poly{


       Dpoly(int  a,int b){
           int result  = super.add(a,b);
           System.out.println(result);

       }
        int add(int a, int b) {
            return a + b;
        }

    }

class  demo{
    public static void main(String[] hi){
        Poly pobj = new Poly();
        int result = pobj.add(1,5);
        System.out.println(result);
        result = pobj.add(1,5,8);
        System.out.println(result);
        float sum = pobj.add(1.5f,5.5f);
        System.out.println(sum);
        sum = pobj.add(1.1f,5.1f,8.5f);
        System.out.println(sum);

        Dpoly dobj = new Dpoly(5,6);

        result = dobj.add(1,3);
        System.out.println(result);

    }
}