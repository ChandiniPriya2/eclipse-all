package ai.jobiak.multithreading;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread t1=new MyThread("T1");
		MyThread t2=new MyThread("T2");
	//	t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("starting my thread");
       t1.start();
       t2.start();
System.out.println("started threads");
	}

}
