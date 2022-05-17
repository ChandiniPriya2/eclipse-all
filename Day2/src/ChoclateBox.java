import java.util.logging.*;

public class ChoclateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("ChoclateBox.class");
		Choclate kitkat = new Choclate("crunchy and soft", 100.00, 10, "silverfoil", false);
		Choclate fuse = new Choclate("Penaut", 25.00, 30, "wrapper", false);
		Choclate dairymilk = new Choclate("Silk", 150.00, 150, "paperbox", false);
		Choclate milkybar = new Choclate("milky", 50.00, 10, "wrapper", true);
		Choclate eclairs = new Choclate("creamy", 10.00, 5, "wrapper", true);
		Choclate galaxy = new Choclate("creamy", 50.00, 50, "silverfoil", false);
		Choclate bournville = new Choclate("penaut", 150.00, 150, "paperbox", false);
		Choclate alamondbar = new Choclate("alamonds", 165.00, 199, "wrapper", true);
		Choclate snickers = new Choclate("peanuts", 100.00, 50, "glass box", false);
		Choclate dark = new Choclate("dark milk", 150.00, 55, "plastic wrapper", false);
		Choclate chok[]=new Choclate[10];
		chok[0]=kitkat;
		chok[1]=fuse;
		chok[2]=dairymilk;
		chok[3]=milkybar;
		chok[4]=eclairs;
		chok[5]=galaxy;
		chok[6]=bournville;
		chok[7]=alamondbar;
		chok[8]=snickers;
		chok[9]=dark;
		for(int i=0;i<chok.length;i++) {
			logger.setLevel(Level.INFO);
			logger.log(logger.getLevel(),"\n Choclate # "+ i + "="+chok[i]);
		//	System.out.println("\n Choclate # "+ i + "="+chok[i]);
			
		}

	}

}
