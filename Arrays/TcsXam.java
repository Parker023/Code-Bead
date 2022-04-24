package org.Parker1.Shannu.App;
import java.util.Arrays;
import java.util.Scanner;
public class TcsXam  {
	public static int printEligibiltyCount(int an,int ar[]) {
		int arr[]=new int[an];
		int count=0;String st;
		for(int i=an;i<ar.length;i++) {
			int med;int p=0;
			for(int j=i-1;j>=i-an;j--) {
				arr[p]=ar[j];
				p++;
			}
			Arrays.sort(arr);
			if(an%2==1) {
			med=arr[((an+1)/2)-1];
			}
			else {
			med=(arr[an/2-1]+arr[an/2])/2;
			}
			if(ar[i]<med)
				 st="not eligible";
			else
				st="eligible";
			if(st.equals("eligible"))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		int an=sc.nextInt();
		int count=printEligibiltyCount(an, ar);
		System.out.println(count);
		sc.close();
	}
}
