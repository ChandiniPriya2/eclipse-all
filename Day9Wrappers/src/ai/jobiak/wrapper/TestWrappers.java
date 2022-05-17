package ai.jobiak.wrapper;

public class TestWrappers {

	public static void main(String[] args) {
		Number num=new Integer("10"); //Number is an abstract class
		System.out.println(num);
		num=new Integer(new String("10"));
      System.out.println(num);
      int i=10;//Integer i=new Integer("10");
      String str="hello";
      Double rad=new Double("27.75");
      System.out.println(rad);
     String total="100" ;
       // System.out.println(total*2);
     int intTotal=Integer.parseInt(total);
  int  tot=intTotal*2;
  System.out.println(tot);
  String total2=intTotal+"";  
  System.out.println(total2);
  //String tot3=intTotal.toString();
  Character ch=new Character('a');
  boolean res=Character.isLetter(ch);
  System.out.println(res);
  }
}
