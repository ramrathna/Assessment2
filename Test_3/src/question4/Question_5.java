package question4;

public class Question_5 {

	public static void main(String[] args) {
	     try {
	         System.out.println("inside try block-1");
	         System.out.println(34 / 0);
	         }
	     
	     catch (ArithmeticException e) 
	     {	         
	         System.out.println("Arithmetic Exception");	         
	     }
	     finally {	         
	         System.out.println(
	             "I am finally block ...:)");	         
	     }
	}
}
