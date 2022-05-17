package ai.jobiak.multithreading;

public class TestMyRunnable {

	public static void main(String[] args) {
		System.out.println("started main");
		System.out.println(Thread.currentThread().getState());
		MyRunnable runnable=new MyRunnable();
	       Thread t1=new Thread(runnable);
	       Thread t2=new Thread(runnable);
	     System.out.println( t1.getState());
	     System.out.println( t1.getState());  
	       //t1.setDaemon(true);
	       //t2.setDaemon(true);
	       t1.start();
	       t2.start();
	       System.out.println( t2.getState());    
	       System.out.println("existing main");
	}

}
