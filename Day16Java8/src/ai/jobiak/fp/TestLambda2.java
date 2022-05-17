package ai.jobiak.fp;
interface Check{
	public void armstrong(int n);
}
interface Check2{
	public void strongNum(int n);
	}
interface Check3{
	public void perfectNum(int n);
}
interface Check4{
	public void fibonacci(int n);
}
interface Check5{
	public void primeSeq(int n);
}
public class TestLambda2 {
public static void main(String[] args) {
		Check c=(int n)->{
			int temp=n,sum=0,r;
			while(temp!=0) {
				r=temp%10;
				sum=sum+r*r*r;
				temp=temp/10;
			}
			if(sum==n) {
				System.out.println("given no is armstrong");
			}
			else {
				System.out.println("given no is not an armstrong");
			}
		};
		c.armstrong(153);
		Check2 c2= (int n)->{
			int m,r,sum=0,fact=1;
			m=n;
			while(n!=0) {
				fact=1;
				r=n%10;
				for(int i=1;i<=r;i++) {
					fact=fact*i;
				}
				n=n/10;
				sum=sum+fact;
				}
			if(sum==m) {
				System.out.println("Given no is strong num");
			}
				else {
					System.out.println("Given no is not a strong num");
			}
			};
		c2.strongNum(145);
		Check3 c3=(int n)->{
			int sum=0;
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
			}
			if(sum==n) {
				System.out.println("given no is perfect ");
			}
			else
				System.out.println("Given no is not perfect");
		};
		c3.perfectNum(6);
		Check4 c4=(int n)->{
			int n1=0,n2=1,n3;
			System.out.print(n1+ " " + n2);
			for(int i=2;i<n;i++) {
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		};
		c4.fibonacci(10);
		Check5 c5=(int n)->{
			
			for(int i=1;i<=n;i++) {
				int count=0;
				for(int j=1;j<=i;j++) {
			      if(i%j==0) {
					count++;}
				}
				   if(count==2) {
					System.out.print("\n");
					System.out.print(i);
			}
				}
			};
		c5.primeSeq(20);
	}
	}


