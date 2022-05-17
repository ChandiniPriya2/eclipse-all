package ai.jobiak.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap3 {

	public static void main(String[] args) {
		HashMap<Integer,BankRecord>record1=new HashMap<>();
BankRecord b1=new BankRecord(12345677,"Kelvin");
BankRecord b2=new BankRecord(334576557,"James");
BankRecord b3=new BankRecord(135467789,"Jockey");
BankRecord b4=new BankRecord(155555555,"Amir");

record1.put(2, b2);
record1.put(3, b3);
record1.put(1 ,b1);
record1.put(4, b4);
record1.put(1, b2);

System.out.println(record1.size());
for(Map.Entry<Integer, BankRecord> e:record1.entrySet()) {
	System.out.println("Key:  " +  e.getKey()  +  "  Value:  "+  e.getValue());
}
}

}
