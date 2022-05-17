package ai.jobiak.priorityqueue;
import java.util.*;
public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> l=new PriorityQueue<>();
		l.add("ravi");
		l.add("John");
		l.add("James");
		l.add("Angel");
		l.add("Bumra");
		l.add("Angel");
	//	l.add(null);        // null is not allowed
System.out.println(l);
System.out.println(l.remove());
System.out.println(l);
System.out.println(l.peek());
System.out.println(l.poll());

System.out.println(l);
	}

}
