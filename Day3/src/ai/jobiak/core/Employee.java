package ai.jobiak.core;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Employee {
	@Setter
	@Getter
	private int empId;
	@Setter
	@Getter
	private String fullName;
	@Setter
	@Getter
	LocalDateTime dateOfJoining;
	@Setter
	@Getter
	private Address commu;
	@Setter
	@Getter
	 Address residence;
	@Setter
	@Getter
	static Address office; 
	@Setter
	@Getter
	private int managerId;
	
	 public Employee(int empId, String fullName, LocalDateTime dateOfJoining,
	 Address commu, Address residence, Address office, int managerId) 
	 { this.empId = empId; this.fullName = fullName; this.dateOfJoining = dateOfJoining;
	  this.commu = commu; this.residence = residence; Employee.office = office;
	  this.managerId = managerId; }
	 /*public int getEmpId() { return empId; } public
	 * void setEmpId(int empId) { this.empId = empId; } public String getFullName()
	 * { return fullName; } public void setFullName(String fullName) { this.fullName
	 * = fullName; } public LocalDateTime getDateOfJoining() { return dateOfJoining;
	 * } public void setDateOfJoining(LocalDateTime dateOfJoining) {
	 * this.dateOfJoining = dateOfJoining; } public Address getCommu() { return
	 * commu; } public void setCommu(Address commu) { this.commu = commu; } public
	 * Address getResidence() { return residence; } public void setResidence(Address
	 * residence) { this.residence = residence; } public Address getOffice() {
	 * return office; } public void setOffice(Address office) { Employee.office =
	 * office; } public int getManagerId() { return managerId; } public void
	 * setManagerId(int managerId) { this.managerId = managerId; }
	 * 
	 * @Override public String toString() { return "Employee [empId=" + empId +
	 * ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining + ", commu=" +
	 * commu + ", residence=" + residence + ", office=" + office + ", managerId=" +
	 * managerId + "]"; }
	 */
}
