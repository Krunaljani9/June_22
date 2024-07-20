package Exception;

public class withouttry_1 {

    public static void main(String[] args) {
        
        int num=30,num2=0;
      try{
            //int devide=num/num2;
            String s="12.15";  
            float i=Float.parseFloat(s);
           // System.out.println(devide);
            System.out.println(i+2);
      }
      catch(Exception e){
         System.out.println("ERRROR"+e);
        }
      System.out.println("rest of the code");
        
        

    }
    
}
