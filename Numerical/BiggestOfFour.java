import java.util.Scanner;

public class BiggestOfFour {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if(a>b&&a>c&&a>d)
        	System.out.println(a+" is biggest ");
        else if(b>c&&b>d)
        	System.out.println(b+" is biggest ");
        else if(c>d)
        	System.out.println(c+" is biggest ");
        else
        	System.out.println(d+" is biggest ");
        sc.close();
	}

}
