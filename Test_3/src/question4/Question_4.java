package question4;

public class Question_4 {
	 static void checkAge(int age) throws ArithmeticException {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied ");
		    }
		    else {
		      System.out.println("Access granted");
		    }
		  }
	public static void main(String[] args) {
		checkAge(1); 
	}
}
