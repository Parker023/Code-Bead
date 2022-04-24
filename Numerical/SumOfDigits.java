import java.util.Scanner;

public class SumOfDigits {
	
         public static int  sum(int n){
        	 int sum=0;
        	 do {
        		 int d=n%10;
             	sum=sum+d;
             	n=n/10;
        	 }while(n!=0);
            	return sum;
            }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int res=sum(x);
		System.out.println(res+" is sum of digits ");
		sc.close();
	}

}
