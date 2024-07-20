package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetEx {

    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  

for(String s:set){
    System.out.println(s);
}
System.out.println("Linked Hash set");
LinkedHashSet<String> set1=new LinkedHashSet<String>();  
set1.add("Agile");  
set1.add("Ravi");  
set1.add("Vijay");  
set1.add("Ravi");  
set1.add("Ajay");  
for(String s:set1){
    System.out.println(s);
}

    }
    
}
