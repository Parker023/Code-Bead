import java.util.Scanner;

public class ProductOfDigits {
		public static int product(int n){
			int sum=1;
			do {
				int d=n%10;
				sum=sum*d;
				n=n/10;
			}while(n!=0);
			return sum;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int res=product(x);
		System.out.println(res);
		sc.close();
	}

}
