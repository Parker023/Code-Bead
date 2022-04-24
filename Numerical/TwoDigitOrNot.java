import java.util.Scanner;

public class TwoDigitOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n/100==0&&n/10!=0)
			System.out.println(n+" is two digit number ");
		else
			System.out.println(n+" is not a two digit number");
			sc.close();
	}

}
