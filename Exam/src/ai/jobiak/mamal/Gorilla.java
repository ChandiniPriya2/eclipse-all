package ai.jobiak.mamal;

public class Gorilla extends Mammal {

	public void throwSomething() {
		energyLevel=energyLevel-5;
	System.out.println("Gorilla has thrown something so that its energy level decreses by 5   "  +energyLevel);
	}  
public void eatBananas() {
	energyLevel=energyLevel+10;
	System.out.println("Gorilla satisfied and its energy increased by 10    "+energyLevel);
}
public void climb() {
	energyLevel=energyLevel-10;
	System.out.println("Gorilla has climbed a tree so that its energy decresed by 10   "+energyLevel);
}
}
