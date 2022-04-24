import java.util.*;
public class SumOfOddEvenArr {
		static String sum(int x[]) {
			int evensum=0,oddsum=0;
			for(int i=0;i<x.length;i++) {
				if(x[i]%2==0) {
					evensum=evensum+x[i];
				}
				
					if(x[i]%2!=0){
						oddsum=oddsum+x[i];
					}	
			}
					return evensum+" "+oddsum;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		String res=sum(ar);
		System.out.println(res);
		sc.close();
	}

}
