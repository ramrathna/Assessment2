package question7;
import java.util.Arrays;
import java.util.HashSet;

public class Question_7 {
	public static void main(String[] args) {
		 Integer[] i1 = {6,5,0,3,1};
		 
	        Integer[] i2 = {3,1,8,5,4};
	 
	        HashSet<Integer> s = new HashSet<>(Arrays.asList(i1));;
	 
	        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(i2));;
	 
	        s.retainAll(s1);
	 
	        System.out.println(s);    

	}

}
