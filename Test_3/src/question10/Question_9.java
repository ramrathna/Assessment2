package question10;

import java.io.File;

public class Question_9 {
	public static void main(String[] args) {
	    File file = new File("D:\\naveen\\demo3.txt");
	 
        File rename = new File("D:\\naveen\\demo4.txt");
  
        
        boolean flag = file.renameTo(rename);
  
        if (flag == true) {
            System.out.println("rename the file");
        }
     
        else {
            System.out.println("rename the file is not changed");
        }
    }
}
