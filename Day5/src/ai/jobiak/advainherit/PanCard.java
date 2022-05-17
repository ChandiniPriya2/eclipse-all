package ai.jobiak.advainherit;

public class PanCard extends FinalDemo2 {
	String fullName;
	String fatherName;
	String dob;
	long panNo=678;

	public PanCard(String fullName, String fatherName, String dob) {
	
		this.fullName = fullName;
		this.fatherName = fatherName;
		this.dob = dob;
		details();
	}
/*	void panno () {
		//final method cannot be overriden;
		System.out.println(panNo);
	}*/
void details() {
	System.out.println("Name of the cardholder is: " + fullName);
	System.out.println("Fathername is : "  + fatherName);
	System.out.println("DateOfBirth:  "  + dob);
}
	}
