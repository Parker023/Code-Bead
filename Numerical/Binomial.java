package org.Parker1.Shannu.App;
import java.util.LinkedList;
import java.util.Scanner;
public class Binomial {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        LinkedList<Integer> ll=new LinkedList<Integer>();
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            ll.clear();
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	                int sum=0;
	                for(int j=1;j<=n;j++){
	                    if(j==1)
	                  sum=sum+(int)(a+Math.pow(2, j-1)*b);
	                    else
	                        sum=sum+(int)(Math.pow(2, j-1)*b);
	                    Integer x=sum;
	                    ll.add(x);
	                }
	                for(Integer e:ll){
	                    // System.out.println();
	                    System.out.print(e+" ");
	                }
	                System.out.println();
	                }
	       
	        in.close();
}
}
