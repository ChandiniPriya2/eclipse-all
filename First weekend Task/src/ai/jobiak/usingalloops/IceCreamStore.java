package ai.jobiak.usingalloops;

import java.util.Scanner;

public class IceCreamStore {

	public static void main(String[] args) {
	 FlavorsAndCosts f1=new FlavorsAndCosts("ButterScotch Walnut",80,450);
	 FlavorsAndCosts f2=new FlavorsAndCosts("Belgium Dark Choclate",85,450);
	 FlavorsAndCosts f3=new FlavorsAndCosts("Dry Khajur",80,450);
	 FlavorsAndCosts f4=new FlavorsAndCosts("Strawberry",70,400);
	 FlavorsAndCosts f5=new FlavorsAndCosts("Choco vanilla",70,400);
	 FlavorsAndCosts f6=new FlavorsAndCosts("Alphonso Mango",70,450);
	 FlavorsAndCosts f7=new FlavorsAndCosts("RealBean vanilla",70,400);
	 FlavorsAndCosts f8=new FlavorsAndCosts("Mixed Fruit",80,450);
	 FlavorsAndCosts f9=new FlavorsAndCosts("ButterScotch",165,650);
	 FlavorsAndCosts f10=new FlavorsAndCosts(" Charlie Choclaty",160,450);
	 FlavorsAndCosts f11=new FlavorsAndCosts("Malai Kulfa",80,450);
	 FlavorsAndCosts f12=new FlavorsAndCosts("Honey and Banana",80,450);
	 FlavorsAndCosts f13=new FlavorsAndCosts("KesarPista",80,329);
	 FlavorsAndCosts f14=new FlavorsAndCosts("SplishSplash",80,300);
	 FlavorsAndCosts f15=new FlavorsAndCosts("CottonCandy",65,353);
	 FlavorsAndCosts f16=new FlavorsAndCosts("Bavarian Choclate",70,377);
	 FlavorsAndCosts f17=new FlavorsAndCosts("Very Berry",50,377);
	 FlavorsAndCosts f18=new FlavorsAndCosts("Honey Nut CrunchyIcecream",80,450);
	 FlavorsAndCosts f19=new FlavorsAndCosts("Pina Colada",84,400);
	 FlavorsAndCosts f20=new FlavorsAndCosts("Black Currant",90,350);
	 System.out.print("------");
	 System.out.print("Welcome to our IceCreamStore");
	 System.out.print("-------\n\n");
	 System.out.println("Menu:");
	 FlavorsAndCosts flav[]=new FlavorsAndCosts[20];
	 flav[0]=f1;
	 flav[1]=f2;
	 flav[2]=f3;
	 flav[3]=f4;
	 flav[4]=f5;
	 flav[5]=f6;
	 flav[6]=f7;
	 flav[7]=f8;
	 flav[8]=f9;
	 flav[9]=f10;
	 flav[10]=f11;
	 flav[11]=f12;
	 flav[12]=f13;
	 flav[13]=f14;
	 flav[14]=f15;
	 flav[15]=f16;
	 flav[16]=f17;
	 flav[17]=f18;
	 flav[18]=f19;
	 flav[19]=f20;
	  for(int i=0;i<flav.length;i++) {
		  System.out.println( i+"."+ flav[i]);
	  }
	  MyProfile c=new MyProfile();
	 System.out.println("Choose the flavor");
	 Scanner sc=new Scanner(System.in);
	 int option=sc.nextInt();
 switch(option) {
case 1:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op=sc.nextBoolean();
	if(op==true) {
	c.buyNow();
	c.payment();
	ButterScotchWalnut b=new ButterScotchWalnut();
	  b.feedback();
	}
	else
		System.out.println("ok!! continue your browsing");
		break;
case 2:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op1=sc.nextBoolean();
	if(op1==true) {
	c.buyNow();
	c.payment();
	BelgiumDarkChoc d=new BelgiumDarkChoc();
	d.feedback();
	}else
		System.out.println("ok!! continue your browsing");
	break;
case 3:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op2=sc.nextBoolean();
	if(op2==true) {
	c.buyNow();
	 c.payment();
	 DryKhaj k=new DryKhaj();
	 k.feedback();
	}else
		System.out.println("ok!! continue your browsing");
	 break;
case 4:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op3=sc.nextBoolean();
	if(op3==true) {
	c.buyNow();
	 c.payment();
	 Strawberry s=new Strawberry();
	 s.feedback();
	}else
		System.out.println("ok!! continue your browsing");
	
break;
case 5:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op4=sc.nextBoolean();
	if(op4==true) {
     c.buyNow();
	 c.payment();
	 ChocoVanilla v=new ChocoVanilla();
	 v.feedback();
	}else
		System.out.println("ok!! continue your browsing");
	break;
case 6:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op5=sc.nextBoolean();
	if(op5==true) {
	c.buyNow();
	 c.payment();
	 AlphMango m=new AlphMango();
	 m.feedback();
	}else
	System.out.println("ok!! continue your browsing");
	
break;
case 7:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op6=sc.nextBoolean();
	if(op6==true) {
	c.buyNow();
	 c.payment();
	 RealbeanVanilla r=new RealbeanVanilla();
	 r.feedback();
	}else
		System.out.println("ok!! continue your browsing");
	break;
case 8:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op7=sc.nextBoolean();
	if(op7==true) {
	c.buyNow();
	 c.payment();
	 MixedFruit m1=new MixedFruit();
	 m1.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 9:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op8=sc.nextBoolean();
	if(op8==true) {
	c.buyNow();
	 c.payment();
	 ButterScotch s1=new ButterScotch();
	 s1.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 10:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op9=sc.nextBoolean();
	if(op9==true) {
	c.buyNow();
	 c.payment();
	 CharlieChoc c1=new CharlieChoc();
	 c1.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 11:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op10=sc.nextBoolean();
	if(op10==true) {
	c.buyNow();
	 c.payment();
	 MalaiKulfa k1=new MalaiKulfa();
	 k1.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 12:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op11=sc.nextBoolean();
	if(op11==true) {
	c.buyNow();
	 c.payment();
	 HoneyandBan h=new HoneyandBan();
	 h.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 13:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op12=sc.nextBoolean();
	if(op12==true) {
	c.buyNow();
	 c.payment();
	 KesarPista p=new KesarPista();
	 p.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 14:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op13=sc.nextBoolean();
	if(op13==true) {
	c.buyNow();
	 c.payment();
	 SplishSplash l=new SplishSplash();
	 l.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 15:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op14=sc.nextBoolean();
	if(op14==true) {
	c.buyNow();
	 c.payment();
	 CottonCandy c2=new CottonCandy();
	 c2.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 16:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op15=sc.nextBoolean();
	if(op15==true) {
	c.buyNow();
	 c.payment();
	 BavarChoc v1=new BavarChoc();
	 v1.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 17:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op16=sc.nextBoolean();
	if(op16==true) {
	c.buyNow();
	 c.payment();
	 VeryBerry b2=new VeryBerry();
	 b2.feedback();
	}else
		System.out.println("ok!! continue your browsing");
			 break;
case 18:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op17=sc.nextBoolean();
	if(op17==true) {
	c.buyNow();
	 c.payment();
	 HoneyNut n=new HoneyNut();
	 n.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 19:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op18=sc.nextBoolean();
	if(op18==true) {
	c.buyNow();
	 c.payment();
	 PinaColada p2=new PinaColada();
	 p2.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
case 20:
	c.addTocart();
	System.out.println("are you want to buy this item");
	boolean op19=sc.nextBoolean();
	if(op19==true) {
	c.buyNow();
	 c.payment();
	 BlackCurrant b3=new BlackCurrant();
	 b3.feedback();
	}else
		System.out.println("ok!! continue your browsing");
break;
default:
	System.out.println("kindly choose the item number  from the above menu");
	
}

}
}

	 
	  
	 
	 
	 
	 
	 
	 

	


