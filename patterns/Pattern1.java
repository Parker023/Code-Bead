import java.util.Scanner;

public class Pattern1 {
	


	static	void pattern11(int n)
	{
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void pattern13(int n) {
		int x=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				x++;
				if(x<=9) 
					System.out.print(x+" ");
				
					else {
						x=1;
						System.out.print(x+" ");
					}
						
				
			}
			System.out.println();
		
		}
	System.out.println();
	}
	
	
	static void pattern14(int n) {
		int x=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				x--;
				if(x>=0) 
					System.out.print(x+" ");
				
					else {
						x=1;
						System.out.print(x+" ");
					}
						
				
			}
			System.out.println();
		}
	}

	
	static	void pattern15(int n)
	{
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.println(j+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			pattern11(x);
			pattern13(x);
			pattern14(x);
			sc.close();
			
		}
	
	}
						

