package ai.jobiak.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Data
public  class StaticDemo {
	@Setter
	@Getter
int rollNo;
	@Setter
	@Getter
String name;
	@Setter
	@Getter
String department;
	@Setter
	@Getter
static String college;

  public StaticDemo(int rollNo, String name, String department,String college)
  { 
	  this.rollNo = rollNo; this.name = name; this.department = department;
  StaticDemo.college=college;
  }
  /*public int getRollNo() { return rollNo; }
 * public void setRollNo(int rollNo) { this.rollNo = rollNo; } public String
 * getName() { return name; } public void setName(String name) { this.name =
 * name; } public String getDepartment() { return department; } public void
 * setDepartment(String department) { this.department = department; } public
 * static String getCollege() { return college; } public static void
 * setCollege(String college) { StaticDemo.college = college; }
 * 
 * @Override public String toString() { return "StaticDemo [rollNo=" + rollNo +
 * ", name=" + name + ", department=" + department + "]"; }
 */


}
