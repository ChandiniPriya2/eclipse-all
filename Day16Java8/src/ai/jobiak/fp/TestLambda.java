package ai.jobiak.fp;
@FunctionalInterface
interface Test{
	public void print(); //only one abstract method is allowed
	public default void paint() {System.out.println("paint method");}
	public static void meth() {System.out.println("static method");}
}
interface Test2{
	public void add(int a,int b);
}
interface Test3{
	public int fact(int n);
}
interface Test4{
	public String getString();
}
public class TestLambda {

	public static void main(String[] args) {
	
            Test t=()->{System.out.println("from print");} ;
            t.print();
            Test2 t2=(int a,int b)->{
            	int c=a+b;
            	System.out.println(c);
            };
            t2.add(10,20);
            Test3 t3=(int n)->{
            	int fact=1;
            	int i=1;
            	while(i<=n) {
            		fact=fact*i;
            		i++;
            	}
            	return fact;
            };
           int factRes=t3.fact(5);
           System.out.println(factRes);
           Runnable r=new Runnable() {
        	   public void run() {
        		   System.out.println("from runnable");
        	   }
           };
           Thread thread=new Thread(r);
           thread.start();
           Runnable r1=()->{ System.out.println("from ()-> runnable");};
	       thread=new Thread(r1);
	        thread.start();
	        
	        Test4 t4=()->"chandini";
	        System.out.println(t4.getString());
	}
	

}
