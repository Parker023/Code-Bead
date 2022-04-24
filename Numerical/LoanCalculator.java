import java.util.Scanner;

public class LoanCalculator {
		static int loan(int n) {
			int i=1;
			while(i<4) {
				int interest = n/10;
				int balance=n-interest;
				n=balance;
				i++;
			}
				return n;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int amount=sc.nextInt();
			int res=loan(amount);
			System.out.println(res);
			sc.close();
	}

}
