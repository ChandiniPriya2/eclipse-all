package ai.jobiak.strings;

public class SuggestPassword {
String password;

public SuggestPassword(String password) {
  this.password = password;
}
 
 public void verifyPassword()
 {
	// boolean valid=false;
 
 if(password.length()>8) {
for(char c:password.toCharArray()) {
	
           if(c=='$'||c=='#') {
     boolean  	 valid=true;
           }
    }

System.out.println("Strong password contain atleast one special characte @,$,#");
     }
 
else 
	System.out.println("Strong password length should be greater than 8 characters");
    System.out.println("Strong password contain upper and lowe case letters");
}
}