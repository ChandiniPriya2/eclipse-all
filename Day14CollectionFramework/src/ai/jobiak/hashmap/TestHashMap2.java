package ai.jobiak.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap2 {

	public static void main(String[] args) {
		
HashMap<Integer,String> record=new HashMap<>();
record.put (2345,"Johnson");
record.put  (3367,"William");
record.put  (1345,"William"); //duplicate values allowed
record.put (6709,"David");
record.put (6709,"Bravo");//if same key diff values,one key alphabetical order val is printed
System.out.println("Size: "  +  record.size());
for(Map.Entry<Integer, String> e:record.entrySet()) {
	System.out.println("Key:  " +  e.getKey()  +  "  Value:  "+  e.getValue());
}
System.out.println(record.containsValue("johnson"));  //checking for the record,case sensitive
record.remove(2345);                    //removing  a record based on key
System.out.println(record.get(2345));   //retrieving a record value
System.out.println(record.get(3367));
System.out.println("After updating");
System.out.println(record);
System.out.println(record.hashCode());
System.out.println("After replacing:");
    record.replace(3367, "Singh");              //replacing a value
System.out.println(record);
System.out.println(record.hashCode());

	}

}
