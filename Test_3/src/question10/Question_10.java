package question10;

public class Question_10 {
	public static void main(String[] args) {
		
		  try{    
            int a[]=new int[5];    
            a[5]=50/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
	    	catch (ArrayIndexOutOfBoundsException e)
		{
	         System.out.println( e);
	      }
         System.out.println("other code will be rest");
	}
}
