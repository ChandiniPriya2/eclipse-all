package ai.jobiak.enums;

public enum Planet {
Mercury("Blue",74.8),
Venus("Brown&Grey",480.8),
Earth("Grey",754.9),
Mars("Red",144.8),
Jupiter("Golden",8.98);
	String colour;
	double Size;
	private Planet(String colour, double size) {
		this.colour = colour;
		Size = size;
	}
	String showCol() {
		return this.colour;
	}
	double showSize() {
		return this.Size;
	}
	
}
