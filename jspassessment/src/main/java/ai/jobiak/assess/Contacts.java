package ai.jobiak.assess;

public class Contacts {
String name;
int num;
public Contacts() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
@Override
public String toString() {
	return "Contacts [name=" + name + ", num=" + num + "]";
}

}
