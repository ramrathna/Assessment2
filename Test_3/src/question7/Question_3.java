package question7;

class MyThread extends Thread{
	   public void run(){
	      System.out.println("Throwing in " +"MyThread");
	      throw new RuntimeException();
	   }
	}

public class Question_3 {
	public static void main(String[] args) {
	      MyThread t = new MyThread();
	      t.start();
	      try {
	         Thread.sleep(5000);
	      } catch (Exception x) {
	         System.out.println("Caught it" + x);
	      }
	      System.out.println("Exiting main");
	   }

}
