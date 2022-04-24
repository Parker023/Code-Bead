import java.util.Scanner;

public class SpecialTwoDigit {
        
	public static void main(String[] args) {
		int i,n,r,x;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	
	    r=n%10;
	    i=n/10;
	    x=i+r+i*r;
	if(x==n)
		
		System.out.println(n+" is special two digit number ");
	
	else
		System.out.println(n+" is not a special two digit number ");
        s.close();
         
        
	}

}
