package ai.jobiak.linkedlist;
import java.util.*;
public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Course> ll=new LinkedList<>();
		 Course c1=new Course("BCL1","ComputerBasic",20,500);
	     Course c2=new Course("PGLI","Alogirthm",40,2500);
	     Course c3=new Course("AdvProgL3","JavProgramming",60,5000);
	     Course c4=new Course("AdvProgL3","JavProgramming",60,5000);
    ll.add(c1);
    ll.add(c2);
    ll.add(c3);
    ll.add(c4);
    Iterator<Course> iter=ll.iterator();
    while(iter.hasNext()) {
    	System.out.println(iter.next());
    }
    
	}

}
