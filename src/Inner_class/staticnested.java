package Inner_class;

public class staticnested {

    static int data=30;  
    static class Inner{  
     static void msg(){
        System.out.println("data is "+data);
        }  
    }
    public static void main(String[] args) {

        //staticnested.Inner obj=new staticnested.Inner();
        //obj.msg();
        staticnested.Inner.msg();
        
    }  
  
    
}
