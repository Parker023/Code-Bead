import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c) {
			if(b>c)
				System.out.println(b+" is middle number ");
			else if(c>b)
				System.out.println(c+" is middle number ");
		}
		else if(b>a&&b>c) {
			if(a>c)
				System.out.println(a+" is middle number ");
			else if(c>a)
				System.out.println(c+" is middle number ");
		}
		else if(c>a&&c>b) {
			if(a>b)
				System.out.println(a+" is middle number ");
			else if(b>a)
				System.out.println(b+" is middle number ");
		}
			sc.close();
			
			
	}
}

