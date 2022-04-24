import java.util.Scanner;

public class HappyNumber {
		static boolean isHappy(int x) {
			
			while(x>9) {
				int sum=0;
				do {
					int d=x%10;
					sum=sum+d*d;
					x=x/10;
				}while(x!=0);
				x=sum;
			}
				return x==1||x==7;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		boolean res=isHappy(v);
		if(res==true) {
			System.out.println("Happy Number");
		}
		else
			System.out.println("Not a Happy Number");
		sc.close();
	}

}
