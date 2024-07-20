package Exception;

class T1{

    public void checkNum(int num){
        if(num==10){
            throw new ArithmeticException("Wrong Input");
        }
        else{
            System.out.println("THIS IS "+num);
        }


    }
}

public class ThrowTest {

    public static void main(String[] args) {
        T1 obj=new T1();
        try{
            obj.checkNum(9);
            System.out.println("In try block");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("always");
        }
        
        
        System.out.println("Rest");
    }
}
