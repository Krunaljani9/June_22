package Inner_class;
interface Showable{  
  void show();  
  interface Message{  
   void msg();  
  }  
}  
//class a
//class b extends a
class TestNestedInterface1 implements Showable.Message{  
 public void msg()
 {
    System.out.println("Hello nested interface");
}  
}

public class NestedInterface {

    public static void main(String[] args) {
        Showable.Message message=new TestNestedInterface1();//upcasting here  
        message.msg();  
             
    }
    
}
