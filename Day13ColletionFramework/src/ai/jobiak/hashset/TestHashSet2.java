package ai.jobiak.hashset;

import java.util.HashSet;

public class TestHashSet2 {

	public static void main(String[] args) {
		HashSet <Course> courseSet=new HashSet<>();
     Course c1=new Course("BCL1","ComputerBasic",20,500);
     Course c2=new Course("PGLI","Alogirthm",40,2500);
     Course c3=new Course("AdvProgL3","JavProgramming",60,5000);
     Course c4=new Course("AdvProgL3","JavProgramming",60,5000);
     courseSet.add(c1);
     courseSet.add(c2);
     courseSet.add(c3);
     courseSet.add(c4);
     System.out.println(courseSet.size());
     System.out.println(c3.hashCode());
     System.out.println(c4.hashCode());
     System.out.println(c3==c4);
     System.out.println(c3.equals(c4));
   for(Course c:courseSet) {
	   System.out.println(c);
   }
	   
			}

}
