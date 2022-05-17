package ai.jobiak.strings;

public class UpperCase {
String input;
public UpperCase() {
	
}
public UpperCase(String input) {
	super();
	this.input = input;
}

public String getInput() {
	return input;
}

public void setInput(String input) {
	this.input = input;
}
public void conversion() {
	char strArr[]=input.toCharArray();
	for(int i=0;i<strArr.length;i++) {
		if(strArr[i]>='a'&&strArr[i]<='z') {
			strArr[i]=(char)((int)strArr[i]-32); //diff b/w upper ASCII and lower ASCII is 32 i.e.,A-65&a-97
		}
	}
	System.out.println("Upper case String is: ");
	for(int i=0;i<strArr.length;i++) {
		System.out.print(strArr[i]);
	}
}



}
