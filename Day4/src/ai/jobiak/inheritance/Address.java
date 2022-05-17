package ai.jobiak.inheritance;

public class Address {
private	String doorNo;
  private String building;
private    String city;
	public Address() {
	}
		public Address(String doorNo, String building, String city) {
	
		this.doorNo = doorNo;
		this.building = building;
		this.city = city;
	}
	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getCity() {
		return city;
	}
	

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", building=" + building + ", city=" + city + "]";
	}
	
	

}
