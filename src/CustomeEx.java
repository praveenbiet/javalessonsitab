package src;

public class CustomeEx extends Exception{
    CustomeEx(String errormsg){
        super(errormsg);
    }
}
class DemocusEx{
    public static void main(String[] ags){
        try{
            throw new CustomeEx("something bad happend");
        }
        catch (CustomeEx e){
            System.out.println(e.getMessage());
        }
    }
}
