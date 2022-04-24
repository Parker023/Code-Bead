import java.util.Scanner;

public class PatternPart4 {
	static	void pattern10(int n)
	{
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=i&&j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static	void pattern12(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		pattern10(x);
		pattern12(x);
		sc.close();
	}

}
