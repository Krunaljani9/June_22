package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class S1{
    int id;
    String sname;
    String mobile;
    
    public S1(int id, String sname, String mobile) {
        this.id = id;
        this.sname = sname;
        this.mobile = mobile;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
}
public class ArrayListTest {
    public static void main(String[] args) {

        S1 sobj1=new S1(1, "Agile-1", "88888888");
        S1 sobj2=new S1(2, "Agile-2", "88888888");
        S1 sobj3=new S1(3, "Agile-3", "88888888");
        
       List<S1> lists1=new ArrayList<>();
       lists1.add(sobj1);
       lists1.add(sobj2);
       lists1.add(sobj3);

       for(S1 s:lists1){
        System.out.println(s.id+" "+s.sname+" "+s.mobile);
    }

        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("C++");
        list.add("C");

        System.out.println(list);
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("Using Iterator");
        Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  

    }
    
}

