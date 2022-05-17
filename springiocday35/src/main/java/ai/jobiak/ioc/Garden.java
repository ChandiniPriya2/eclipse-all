package ai.jobiak.ioc;
import java.util.*;
public class Garden {

	ArrayList<String> fruits;
	ArrayList<String>flowers;
	HashSet<String> trees;
	HashMap<String,String>cityFruit;
	
	public HashMap<String, String> getCityFruit() {
		return cityFruit;
	}
	public void setCityFruit(HashMap<String, String> cityFruit) {
		this.cityFruit = cityFruit;
	}
	public Garden() {
		// TODO Auto-generated constructor stub
	}
	public Garden(ArrayList<String> flowers) {
	
		this.flowers = flowers;
	}
public void setFruits(ArrayList<String> fruits) {
		System.out.println("set called");
		this.fruits = fruits;
	}

public void setTrees(HashSet<String> trees) {

	this.trees = trees;
}

	public HashSet<String> getTrees() {
	return trees;
}
	@Override
	public String toString() {
		return "Garden [fruits=" + fruits + ", flowers=" + flowers + ", trees=" + trees + ", cityfruit=" + cityFruit
				+ "]";
	}
	
}
