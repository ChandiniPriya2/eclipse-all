package ai.jobiak.priorityqueue;

import java.util.*;

public class TestPriorityQueue2 {

	public static void main(String[] args) {
		PriorityQueue<Course> p=new PriorityQueue<>();
		 Course c1=new Course("BCL1","ComputerBasic",20,500);
	     Course c2=new Course("PGLI","Alogirthm",40,2500);
	     Course c3=new Course("AdvProgL3","JavProgramming",60,5000);
	     Course c4=new Course("AdvProgL3","JavProgramming",60,5000);
       p.add(c1);
       p.add(c2);
       p.add(c3);
       p.add(c4);
    
       for(Course c:p) {
    	   System.out.println(c);
       }
	}

}
