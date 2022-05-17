package ai.jobiak.hashmap;
import java.util.*;
import java.util.Map.Entry;
public class TestHashMap {

	public static void main(String[] args) {
		HashMap players=new HashMap();
		/*map.put("Apple", "iphone");
		map.put("Samsung", "Note1");
		map.put("Nokia", "Windows");
		map.put("BlackBerry", "First SmartPhone");*/
		players.put(1,"Rohit");
		players.put(3,"Dhoni");
		players.put(2, "Bumra"); 
		players.put(4, "Raina");
		players.put(1, "Rohit Sharma");
		players.put(1, "Rohit Sharma");
System.out.println(players);
		/*System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("Nokia"));
		Set keys=map.keySet();
		//System.out.println(keys);
		Iterator iter=keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection values=map.values();
		for(Object v:values) {
			System.out.println(v);
		}
		Set<Entry<Object,Object>>entries=map.entrySet();
		Iterator iter2=entries.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}*/
	}

}
