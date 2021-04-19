package question10;

import java.util.HashMap;
import java.util.Map;

public class Question_5 {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer,String>();
		h.put(11,"naveen");
		h.put(12,"prasad");
		h.put(13,"ram");
		h.put(14,"rathna");
		
		for (Map.Entry<Integer, String> set :h.entrySet()) 
		{
		    System.out.println(set.getKey() + " = " + set.getValue());
		    
		    
		}
	}
}
