package ai.jobiak.inheritance;

public class ResidAddress extends Address {
	String houseno;
	String landMark;
	String colony;
	public ResidAddress(  String doorNo, String building, String city  , String houseno, String landMark, String colony) {
		super(doorNo,building,city);;
		this.houseno = houseno;
		this.landMark = landMark;
		this.colony = colony;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" +getDoorNo() + ", building=" + getBuilding() + ", city=" + getCity ()+ "ResidAddress [houseno=" + houseno + ", landMark=" + landMark + ", colony=" + colony + "]";
	}

}
