package ai.jobiak.advainherit;

public class FinalDemo1 {
	 final long adharNo=12345678;
	 String name;
     String address;
     
     public FinalDemo1( String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	
	void details() {
		
	//	 adharNo=45678; final var cannot be initialized again;
		
		System.out.println("Aadhar no: "+ adharNo);
		System.out.println("Name is: " + name);
		System.out.println("Addree is: "+address);
		
	}
}
	
	



