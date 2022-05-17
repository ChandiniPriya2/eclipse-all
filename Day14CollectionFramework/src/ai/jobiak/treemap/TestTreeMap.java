package ai.jobiak.treemap;
import java.util.*;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap players=new TreeMap();
		players.put(1,"Rohit");
		players.put(3,"Dhoni");
		players.put(2, "Bumra"); 
		players.put(4, "Raina");
		players.put(1, "Rohit Sharma");
		players.put(1, "Rohit Sharma");
	//	String name=(String)players.put(1, "Rohit sharma");
		System.out.println(players);

	}

}
