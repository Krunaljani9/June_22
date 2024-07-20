package FileOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) throws IOException {
        
        File f=new File("C:/Java/FileOperationExample_1.txt");
        try {
            FileReader fir=new FileReader(f);
            BufferedReader buff=new BufferedReader(fir);
            String[] words=null; 
            int count=0;
            //int acount=0;
            String str;
            while((str=buff.readLine())!=null){
                words=str.split(" ");
                count=count+words.length;
                    //System.out.println((char)c);
              //      char ch=(char)c;            

            }
            System.out.println("count words "+count);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Unexpected error occurred");  
        }
    }
    
}
