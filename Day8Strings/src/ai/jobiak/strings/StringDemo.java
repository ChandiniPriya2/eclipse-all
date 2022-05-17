package ai.jobiak.strings;

public class StringDemo {

	public static void main(String[] args) {
		String str=new String("java beginers");
		char letters[]=new char[str.length()];
	
	
	for(int i=0;i<letters.length;i++) {              //char letters[]=str.toCharArray();

	           letters[i]=str.charAt(i);                         /*for(int i=0;i<letters.length;i++){
        }                                                                                    System.out.println(letters[i]);	       
		                                                                         }*/
		for(char c:letters)
		{
		System.out.println(c);
    	}
		

		
			
	}

	}
}
