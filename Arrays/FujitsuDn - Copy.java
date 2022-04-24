import java.util.*;
public class FujitsuDn {
			static int calculation(int n,int a[],int k) {
				int x=0,sum=0,y=k;
			int len=a.length;
				for(int i=0;i<len;i++) {
					sum=sum+a[i];
				}
				System.out.println(sum);
					for(int i=y;i<2*k;i++) {
						x=x+a[i];
					}
					System.out.println(x);
					int result=sum-x;
					return result;
			}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter size of an array");
			int n=sc.nextInt();		
			int a[]=new int[n];
			System.out.println("enter array elements");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("enter interval");
			int k=sc.nextInt();
			
			int res=calculation(n,a,k);	
			System.out.println("result is :"+res);
		sc.close();
		
	}
}
