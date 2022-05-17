package ai.jobiak.treemap;
import java.util.*;
public class TestCourseTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,Course>t=new TreeMap<>();
		Course c1=new Course("BCL1","ComputerBasic",20,500);
	     Course c2=new Course("PGLI","Alogirthm",40,2500);
	     Course c3=new Course("AdvProgL3","JavProgramming",60,5000);
	     Course c4=new Course("AdvProgL3","JavProgramming",60,5000);
         t.put(2, c2);
         t.put(1, c1);
         t.put(3, c3);
         t.put(3, c4);
       
         System.out.println(t);
         }

}
