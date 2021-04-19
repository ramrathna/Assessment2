package question4;

public class Question_6 extends Thread{
	public void run()  
    {    
        try  
        {   
            Thread.sleep(500);    
            System.out.println("javatpoint");    
        }
        catch(InterruptedException e)
        {    
            System.out.println("Exception handled "+e);    
        }   
        
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {    
    	Question_6 t1=new Question_6();    
    	Question_6 t2=new Question_6();  
        t1.start();     
        t1.interrupt();    
    }    
}
