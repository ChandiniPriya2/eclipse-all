package ai.jobiak.arraylist;
import java.util.*;


public class CheckArrayList {

	public static void main(String[] args) {
		ArrayList<Course>list=new ArrayList<>();
		  Course c1=new Course("BCL1","ComputerBasic",20,500);
		     Course c2=new Course("PGLI","Alogirthm",40,2500);
		     Course c3=new Course("AdvProgL3","JavProgramming",60,5000);
		    Course c4=new Course("AdvProgL3","JavProgramming",60,5000);
		     list.add(c1);
		     list.add(c2);
		     list.add(c3);
    list.add(c4);
		     System.out.println(list.size());
//Collections.sort((Course)list);
		     for(int i=0;i<list.size();i++) {
		    	 System.out.println(list.get(i));
		     }
		     
	}

}
