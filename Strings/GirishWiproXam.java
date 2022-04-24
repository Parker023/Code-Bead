package org.Parker1.Shannu.App;
import java.util.Scanner;
import java.util.regex.Pattern;
public class GirishWiproXam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[][]= {{0,2},{3,3},{5,3}};
		System.out.println(printCustomerServed(ar));
		sc.close();
	}
	private static String printCustomerServed(int[][] ar) {
		int wait_time=0,count=0,c=0;String k="", p="";
		for(int i=0;i<ar.length;i++) {
			if(wait_time>ar[i][0]) {
				if(count==0)
					p=p+":"+"c"+i;
				else
					p=p+"-"+"c"+i;
				count++;
				continue;
			}
			else {
				if(i==ar.length-1)
					k=k+"-"+"c"+i;
				else {
					if(c==0)
						k=k+"c"+i;
					else
						k=k+"-"+"c"+i;
				}
				c++;
			}
			wait_time=wait_time+ar[i][1];
		}
		k=k+p;
		if(!Pattern.matches(k, ":")) {
			return "Served";
		}
		else
			return k;
	}

}
