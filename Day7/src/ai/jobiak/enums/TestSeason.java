package ai.jobiak.enums;



public class TestSeason {
	Season val;
	public TestSeason(Season val) {
		this.val=val;
	}
	void month() {
		switch(val)
		{
		case Jan:
		case Feb:	
			   System.out.println("winter");
			   break;
		case Mar:
		case Apr:
			System.out.println("spring");
			break;
		case May:
		case Jun:
			System.out.println("summer");
			break;
		case Jul:
		case Aug:
			System.out.println("monsoon");
			break;
		case Sep:
		case Oct:
			System.out.println("autumn");
			break;
		case Nov:
		case Dec:
			System.out.println("pre winter");
			break;
			default:
				System.out.println("Invalid");
	}
		}
	}
