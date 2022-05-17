package ai.jobiak.multithreading;

public class MyThread extends Thread {
String thread;

public MyThread(String thread) {

	this.thread = thread;
}
public void run() {
	for(int i=1;i<5;i++) {
		System.out.println(this.thread+"entered run()="+i);
		try {
			sleep(5000);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	
}

}
