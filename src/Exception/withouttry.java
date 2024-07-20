package Exception;

class TestThrow {  
    //defining a method  
    public  void checkNum(int num) {  
        if (num < 1) { 
            System.out.println("Before throw"); 
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
            //System.out.println("After throw");
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }
    public int divideNum(int m, int n) throws ArithmeticException {  
        int div = m / n;  
        return div;  
    } 
  
}

public class withouttry {
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();  
        try{
            //obj.checkNum(-2);
            obj.divideNum(10, 0);
        }catch(ArithmeticException e){
            System.out.println("Bhaya e galat input hey"+e);
        }
              
            System.out.println("Rest of the code..");  
           
    }
    
}
