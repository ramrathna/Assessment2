package question7;

public class Question_5 extends Thread {
	 public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
		 }  
		 public static void main(String[] args){  
			 Question_5 q1=new Question_5();//creating thread  
			 Question_5 q2=new Question_5();  
			 Question_5 q3=new Question_5();  
		  
		  q1.setDaemon(true);//now t1 is daemon thread  
		    
		  q1.start();//starting threads  
		  q2.start();  
		  q3.start();  
		 }  
}
