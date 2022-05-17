package ai.jobiak.wrapper;

public class StringContains {
 private String str;

public StringContains(String str) {
	super();
	this.str = str;
}

public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}

@Override
public String toString() {
	return "StringContains [str=" + str + "]";
}

void demo() {
	if(str.contains(".com")&&str.contains("@gmail"))
		System.out.println("Format of email address is  valid");
	else
		System.out.println("Format of email address  is  not valid");

}

}
