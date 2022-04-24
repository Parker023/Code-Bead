import java.util.Scanner;

public class Wipro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		do {
			int d=n%10;
			if(d%2!=0) 
				sum=sum+d;
			n=n/10;
		}while(n!=0);
			System.out.println(sum);
		sc.close();
	}

}
