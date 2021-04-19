package question4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question_7 {
	public static void main(String[] args) throws IOException {
	    
	    File file = new File("D:\\naveen\\demo1.txt");
	   
	    FileInputStream inputStream = new FileInputStream(file);
	   
	    Scanner sc = new Scanner(inputStream);
	   
	    StringBuffer buffer = new StringBuffer();
	  
	    while(sc.hasNext()) {
	       buffer.append(" "+sc.nextLine());
	    }
	    System.out.println("Contents of the file: "+buffer);

	    File dest = new File("D:\\naveen\\demo2.txt");

	    FileWriter writer = new FileWriter(dest);

	    writer.write(buffer.toString());
	    writer.flush();
	    System.out.println("File copied successfully.......");
	 }
	}


