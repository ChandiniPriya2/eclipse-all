package ai.jobiak.inheritance;

public class OfficeAddress extends Address {

String incharge;
int block;
String offName;
public OfficeAddress() {
	
}
public OfficeAddress(String doorNo, String building, String city,String incharge, int block, String offName) {
   super(doorNo,building,city);
	this.incharge = incharge;
	this.block = block;
	this.offName = offName;
}
public String getIncharge() {
	return incharge;
}
public void setIncharge(String incharge) {
	this.incharge = incharge;
}
public int getBlock() {
	return block;
}
public void setBlock(int block) {
	this.block = block;
}
public String getOffName() {
	return offName;
}
public void setOffName(String offName) {
	this.offName = offName;
}
@Override
public String toString() {
	return "Address [doorNo=" +getDoorNo() + ", building=" + getBuilding() + ", city=" + getCity ()+ "OfficeAddress [incharge=" + incharge + ", block=" + block + ", offName=" + offName + "]";
}

}
