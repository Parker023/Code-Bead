import java.util.Scanner;

public class CheckEqual {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a-b==0)
			System.out.println(a+" and "+b+"are equal");
		else
			System.out.println(a+" and "+b+" are not equal ");
		s.close();
	}

}
