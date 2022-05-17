package ai.jobiak.mvc;

public class User {
String fname;
String mobile;
String mail;
public User() {
	// TODO Auto-generated constructor stub
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
@Override
public String toString() {
	return "User [fname=" + fname + ", mobile=" + mobile + ", mail=" + mail + "]";
}


}
