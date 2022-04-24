import java.util.Scanner;

public class Patternpart3 {
		
	static	void pattern7(int n)
	{
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)(i+96)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}


	static	void pattern8(int n)
	{
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}


	static	void pattern9(int n)
	{
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
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
		pattern7(c);
		pattern8(a);
		pattern9(b);
		sc.close();

}
}
