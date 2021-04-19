package question10;
import java.io.File;


public class Question_4 {
	public static void main(String[] args)
	{
	             File file1 = new File("C:\\Users\\navv2c18457\\Documents");
		        File file2 = new File("C:\\Users\\navv2c18457\\Documents");
		       
		
		        if (file1.compareTo(file2) == 0) {
		            System.out.println("path are same");
		        }
		        else {
		            System.out.println("path are not same");
		        }
	}
}
