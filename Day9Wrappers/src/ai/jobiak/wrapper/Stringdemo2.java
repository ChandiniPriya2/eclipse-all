package ai.jobiak.wrapper;

public class Stringdemo2 {
String email;
String str="chandinipriya@gmail.com";
public Stringdemo2(String email) {
	super();
	this.email = email;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
void check() {
	if(email.contentEquals(str)) {
		System.out.println("valid user");
	}
	else
		System.out.println("please try again!! your user name is not valid");
	}
}

