package ai.jobiak.assess;


public class Values {
String name;
String mail;
int mobile;
public Values() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Values [name=" + name + ", mail=" + mail + ", mobile=" + mobile + "]";
}
public Values(String name, String mail, int mobile) {
	super();
	this.name = name;
	this.mail = mail;
	this.mobile = mobile;
}


}
