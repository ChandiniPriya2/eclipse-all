package ai.jobiak.strings;



public class Gmail {
	
String mail;
String password1="Strong@341";

public Gmail(String mail) {
	
	this.mail = mail;
}
void verifyMail() {
int temp=0,flag=0;
	boolean valid =false;
	for(char c : mail.toCharArray())
	{
      if(c=='@'&&c=='.') {
    	
    	    valid=true;
    	   }
     
	}
    if(valid)
		System.out.println("valid email id");
    else
    	System.out.println("invalid email id");
	
}

}
