package ai.jobiak.hashset;
//import java.time.LocalDateTime;
import java.util.*;
public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> colors =new HashSet<>();
colors.add("blue");
colors.add("pink");
colors.add("green");
colors.add("yellow");
colors.add("purple");
colors.add(" red");
colors.add("pink");
/*LocalDateTime ldt=LocalDateTime .now();
colors.add(ldt);
colors.add(new Boolean(false));
colors.add(new Integer(100));
colors.add(new Object());//only Object hashcode will be printed if we didn't mention<string> if we use for loop
*/
System.out.println(colors.size());
Set<String> set=colors;       //unordered sequence of elements,duplicates not allowed
System.out.println(set);
Iterator<String> iter=set.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
}
//Object[] str=set.toArray();
for(String str1:colors) {
	System.out.println(str1);
}

System.out.println(colors.contains("green"));

	List <String > list=new ArrayList<String>(colors); //converting hashset to arraylist
	System.out.println(list.get(3));
	
String str[]=colors.toArray(new String[colors.size()]); //converting hashset toarray
System.out.println(str[3]);
}
}
