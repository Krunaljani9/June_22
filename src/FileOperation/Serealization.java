package FileOperation;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;  
 class Stud implements Serializable{  
 int id;  
 String name;  
 public Stud(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}

public class Serealization {
    public static void main(String[] args) {
        
        try{    
            //Creating the object    
            Stud s1 =new Stud(211,"ravi");    
            //Creating stream and writing the object    
            FileOutputStream fout=new FileOutputStream("f.txt");    
            ObjectOutputStream out=new ObjectOutputStream(fout);    
            out.writeObject(s1);    
            out.flush();    
            //closing the stream    
            out.close();    
            System.out.println("success");    
            }catch(Exception e){System.out.println(e);}
    }
    
}
