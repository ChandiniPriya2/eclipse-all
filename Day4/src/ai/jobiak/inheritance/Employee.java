package ai.jobiak.inheritance;

import java.time.LocalDateTime;

public class Employee {
	private int empId;
	private String fullName;
	LocalDateTime dateOfJoining;
	private OfficeAddress commu;
	ResidAddress residence;
	private int managerId;
	public Employee(int empId, String fullName, LocalDateTime dateOfJoining, OfficeAddress commu,ResidAddress residence
		, int managerId) {
		this.empId = empId;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.commu = commu;
		this.residence = residence;
		
		this.managerId = managerId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public OfficeAddress getCommu() {
		return commu;
	}
	public void setCommu(OfficeAddress commu) {
		this.commu = commu;
	}
	public ResidAddress getResidence() {
		return residence;
	}
	public void setResidence(ResidAddress residence) {
		this.residence = residence;
	}
	
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining + ", commu="
				+ commu + ", residence=" + residence +  " managerId=" + managerId + "]";
	}
}
