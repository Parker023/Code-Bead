import java.util.Scanner;

public class Palindrome {
	
		static String input(int n){
			int d,num=n,r=0; 
			do {
				 d=n%10;
			r=r*10+d;
				n=n/10;
			}while(n!=0);
			if(num==r) {
				return "palindrome";
			}
				
			else 
				return"not a palindrome";
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		String res=input(x);
		System.out.println(res);
		sc.close();
	}

}
