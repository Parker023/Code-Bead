import java.util.Scanner;

public class PalindromeCharacters {
			
		public static String input(String n){
				String revstr="";
				int len=n.length();
				for(int i=len-1;i>=0;i--) {
					revstr=revstr+n.charAt(i);
				}
				if(n.equals(revstr)) {
					return "palindrome";
				}
					
				else
					return"not a palindrome";
				
			}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res=input(str);
		System.out.println(res);
		sc.close();
	}

}
