import java.util.Scanner;

public class Pattern2 {
static	void pattern2(int n)
	{
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}


static	void pattern3(int n)
{
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
}


static	void pattern4(int n)
{
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();
	}
	System.out.println();
}


static	void pattern5(int n)
{
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print((char)(j+96)+" ");
		}
		System.out.println();
	}
	System.out.println();
}


static	void pattern6(int n)
{
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print((char)(i+64)+" ");
		}
		System.out.println();
	}
	System.out.println();
}







	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		pattern2(a);
		pattern3(b);
		pattern4(c);
		pattern5(a);
		pattern6(b);
		sc.close();
		
	}

}
