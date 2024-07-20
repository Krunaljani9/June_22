package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("C++");
        list.add("C");
        LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
al.addAll(list);

for(String s:al){
    System.out.println(s);
}
//al.removeLast();
al.remove("Ajay");
System.out.println("after remove element ");
for(String s:al){
    System.out.println(s);
}
    }
    
}
