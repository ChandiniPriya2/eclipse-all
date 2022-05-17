package ai.jobiak.multithreading;

public class UseThreadDemo {

	public static void main(String[] args) {
		System.out.println("started main");
	     /*  ThreadDemo t1=new ThreadDemo("T1");
	       ThreadDemo t2=new ThreadDemo("T2");
	       t1.setDaemon(true);
	       t2.setDaemon(true);
	       t1.start();
	       t2.start();
	       System.out.println("existing main");*/
	       System.out.println(Thread.currentThread().getId());
	       System.out.println(Thread.currentThread().getName());
	       System.out.println(Thread.currentThread().getPriority());
	       System.out.println(Thread.currentThread().isAlive());
	       System.out.println(Thread.currentThread().toString());
	       System.out.println(Thread.currentThread().isInterrupted());
	       System.out.println(Thread.currentThread().getClass());
	       System.out.println(Thread.currentThread().hashCode());
	       System.out.println(Thread.currentThread().getState());
	       System.out.println(Thread.currentThread().getThreadGroup());
	       System.out.println(Thread.currentThread().getStackTrace());
	       
	       
	       

	}

}
