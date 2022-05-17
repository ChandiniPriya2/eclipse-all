package ai.jobiak.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
	@Setter
	@Getter
	String doorNo;
	@Setter
	@Getter
	String building;
	@Setter
	@Getter
	String city;
	
	
	
	
	
	
	
	
//	public Address(String doorNo, String building, String city) {
//		this.doorNo = doorNo;
//		this.building = building;
//		this.city = city;
//	}
//	public String getDoorNo() {
//		return doorNo;
//	}
//
//	public void setDoorNo(String doorNo) {
//		this.doorNo = doorNo;
//	}
//
//	public String getBuilding() {
//		return building;
//	}
//
//	public void setBuilding(String building) {
//		this.building = building;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	@Override
//	public String toString() {
//		return "Address [doorNo=" + doorNo + ", building=" + building + ", city=" + city + "]";
//	}
//	
//	

}
