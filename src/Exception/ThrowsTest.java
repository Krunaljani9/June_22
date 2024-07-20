package Exception;

class T2 extends Exception{
    void devideEx() {
        System.out.println("devision exception");
    }
}

public class ThrowsTest {

    public static void devide(int a,int b) throws ArithmeticException
    {
        System.out.println("devision "+a/b);
    }

    public static void main(String[] args) {
        
        int num1=10,num2=0;
        // try{
        //     devide(num1,num2);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Error");
        // }
        

        try{
            if(num2==0){
                T2 obj=new T2();
           throw obj;
            }
            System.out.println(num1/num2);
           
        }
        catch(T2 e){
            e.devideEx();
        }
        
    }
    
}
