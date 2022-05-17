import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ThisDemo {
	@Setter
	@Getter
	private long empid;
	@Setter
	@Getter
	private String empname;
	@Setter
	@Getter
private	long salary;
	@Setter
	@Getter
	private String position;
	@Setter
	@Getter
private 	String location;
/*
 * public ThisDemo(long empid, String empname, long salary, String position,
 * String location) { this.empid = empid;//to distinguish local and instance
 * variables; this.empname = empname; this.salary = salary; this.position =
 * position; this.location = location; }
 * 
 * public long getSalary() { return salary; }
 * 
 * public void setSalary(long salary) { this.salary = salary; }
 * 
 * public String getPosition() { return position; }
 * 
 * public void setPosition(String position) { this.position = position; }
 * 
 * public String getLocation() { return location; }
 * 
 * public void setLocation(String location) { this.location = location; }
 * 
 * @Override public String toString() { return "ThisDemo [empid=" + empid +
 * ", empname=" + empname + ", salary=" + salary + ", position=" + position +
 * ", location=" + location + "]"; }
 * 
 * 
 * 
 */
}
