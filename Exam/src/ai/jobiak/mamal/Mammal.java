package ai.jobiak.mamal;

public class Mammal {
double energyLevel=100;
public double getEnergyLevel() {
	return energyLevel;
}
public void setEnergyLevel(double energyLevel) {
	this.energyLevel = energyLevel;
}
public void displayEnergy() {
	System.out.println("Energy of gorilla is"+ this.energyLevel);
}
}
