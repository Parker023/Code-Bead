
import java.util.*;
public class MainArray {
	static boolean isPrime(int x) {
		for(int i=2;i<x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
		static int  smallest(int p,int arr[]) {
			int count=0;
			
				for(int j=0;j<p;j++) {
					boolean ou=isPrime(arr[j]);
					if(ou==true)
						count++;
				}
			
				return count;
					
			}
				
		
		
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
			int res=smallest(n, arr);
			System.out.println(res);
			sc.close();
	}

}
