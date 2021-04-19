package question10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_3 {
	 public static void main(String[] args) 
	    {
	        String s = "we are java developers in vee technology";
	          
	        Pattern p = Pattern.compile("\\b[a-zA-Z]");
	        Matcher m1 = p.matcher(s);
	        while (m1.find())
	        	
	         System.out.print(m1.group());
	    }
}
