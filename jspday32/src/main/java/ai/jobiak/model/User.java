package ai.jobiak.model;

public class User implements java.io.Serializable{
String fname;
String email;
String mobile;
public User() {
	System.out.println("bean instantiated");
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
	System.out.println("prop is set "+fname);
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}


}
