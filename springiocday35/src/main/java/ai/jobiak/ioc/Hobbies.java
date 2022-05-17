package ai.jobiak.ioc;

public class Hobbies {
private String personal;
private String professional;
public Hobbies() {
	// TODO Auto-generated constructor stub
}
public Hobbies(String personal, String professional) {
	super();
	this.personal = personal;
	this.professional = professional;
}
@Override
public String toString() {
	return "Hobbies [personal=" + personal + ", professional=" + professional + "]";
}


}
