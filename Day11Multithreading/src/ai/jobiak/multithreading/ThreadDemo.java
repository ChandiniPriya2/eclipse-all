package ai.jobiak.multithreading;

public class ThreadDemo extends Thread {
	String name;
	
	public ThreadDemo(String name) {
		
		this.name = name;
	}

	public void run() {
		for(int i=1;i<=5;i++) {
	                System.out.println(this.name+"enterd run");//System.out.println(this.currentThread().getname())
       }
		
}
}