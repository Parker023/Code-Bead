import java.util.Scanner;

public class MonthNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m;
		m=sc.nextInt();
		if(m>0&&m<=12)
			System.out.println("month number is valid");
		else
			System.out.println("month number is not valid");
		sc.close();
		
	}

}
