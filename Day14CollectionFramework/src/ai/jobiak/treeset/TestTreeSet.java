package ai.jobiak.treeset;
import java.util.TreeSet;

//import ai.jobiak.hashset.Course;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Course> set=new TreeSet<>();
		Course c1=new Course("BCL1","ComputerBasic",20,500);
	     Course c2=new Course("PGLI","Alogirthm",40,2500);
	     Course c3=new Course("AdvProgL3","JavProgramming",60,5000);
	     Course c4=new Course("AdvProgL3","JavProgramming",60,5000);
     set.add(c1);
     set.add(c2);
     set.add(c3);
     set.add(c4);
		/*set.add("Mango");
		set.add("Grapes");
		set.add("Apple");
		set.add("Banana");
		set.add("Apple");*/  //sorted order,duplicates are not allowed
		
     System.out.println(set);
	}

}
