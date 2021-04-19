package question10;

public class Question_6 extends Thread{
	public void run()
	 {  
		  for(int i=1;i<=5;i++)
		  {  
		   try
		   {  
		    Thread.sleep(500);  
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
			   }  
		  System.out.println(i);  
		  }  
		 }  
		public static void main(String args[]){  
			Question_6 t1=new Question_6();  
			Question_6 t2=new Question_6();  
			Question_6 t3=new Question_6();  
		 t1.start();  
		 try{ 
			 
		  t1.join();  
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
			 }  
		  
		 t2.start();  
		 t3.start();  
		 }  

}
