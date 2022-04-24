import java.util.*;
public class HighstringLenArr {
	
			static String  stringLen(String x[]) {
				int len=x[0].length(); String temp=x[0];
				for(int i=1;i<x.length;i++) {
					if(x[i].length()>len)
						len=x[i].length();
					temp=x[i];
				}
					return temp;
			}
			
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ar[]=new String[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.next();
		}
			String res =stringLen(ar);
			System.out.println(res);
			sc.close();
	}

}
