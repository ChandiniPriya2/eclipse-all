import java.util.logging.Level;
import java.util.logging.Logger;

public class ChoclateProducts {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger("ChoclatrProducts.class");
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
		logger.setLevel(Level.INFO);
		logger.log(logger.getLevel()," "+kitkat);
		//System.out.println(kitkat);
	//	System.out.println(fuse);
		logger.log(logger.getLevel()," "+fuse);
	//	System.out.println(dairymilk);
		logger.log(logger.getLevel()," "+dairymilk);
	//	System.out.println(milkybar);
		logger.log(logger.getLevel()," "+milkybar);
	//	System.out.println(eclairs);
		logger.log(logger.getLevel()," "+eclairs);
	//	System.out.println(galaxy);
		logger.log(logger.getLevel()," "+galaxy);
	//	System.out.println(bournville);
		logger.log(logger.getLevel()," "+bournville);
	//	System.out.println(alamondbar);
		logger.log(logger.getLevel()," "+alamondbar);
	//	System.out.println(snickers);
		logger.log(logger.getLevel()," "+snickers);
		//System.out.println(dark);
		logger.log(logger.getLevel()," "+dark);
		boolean result1 = kitkat == snickers;
		//System.out.println(result);
		logger.log(logger.getLevel()," "+result1);
		result1 = alamondbar == fuse;
		//System.out.println(result);
		logger.log(logger.getLevel()," "+result1);
		result1 = dark == milkybar;
		System.out.println(result1);
		Choclate temp = fuse;
		System.out.println("#check" + fuse.hashCode());
		System.out.println("#check" + temp.hashCode());
		if (snickers instanceof Choclate && dark instanceof Choclate) {
			result1 = snickers == dark;
			System.out.println(result1);
		}

		}

	}


