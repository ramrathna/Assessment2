package question10; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question_1 {
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("naveen");
		a.add("prasad");
		a.add("ram");
		a.add("rathna");
		
		Iterator<String> i = a.iterator();
        while(i.hasNext())
		
	    System.out.println(i.next());
		

	}
}
