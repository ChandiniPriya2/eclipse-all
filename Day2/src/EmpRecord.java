import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("EmpRecord.class");
		ThisDemo emp1=new ThisDemo(1234,"Rani",25000,"developer","vizag");
		ThisDemo emp2=new ThisDemo(4567,"Ram",15000,"tester","vizag");
		ThisDemo emp3=new ThisDemo(4789,"Saketh",24000,"developer","hyd");
		ThisDemo emp4=new ThisDemo(1489,"Ramya",100000,"Manager","vizag");
		ThisDemo record[]=new ThisDemo[4];
		record[0]=emp1;
		record[1]=emp2;
		record[2]=emp3;
		record[3]=emp4;
		int j=0;
		for(int i=0;i<record.length;i++) { //count the no of employees in particular branch
			if(record[i].getLocation()=="vizag") {
				j=j+1;
				
			}
		}
		//System.out.println("There are "+j+" members in vizag branch");	
		logger.setLevel(Level.INFO);
		logger.log(logger.getLevel(),"There are "+j+" members in vizag branch");
	}

}
