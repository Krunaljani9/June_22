package FileOperation;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {  
      
        try {  
            FileWriter fwrite = new FileWriter("C:/Java/FileOperationExample_1.txt");  
            // writing the content into the FileOperationExample.txt file  
            fwrite.write("Hello Agile!!");   
       
            // Closing the stream  
            fwrite.close();   
            System.out.println("Content is successfully wrote to the file.");  
        } catch (IOException e) {  
            System.out.println("Unexpected error occurred");  
           // e.printStackTrace();  
            }  
        }  
    
}
