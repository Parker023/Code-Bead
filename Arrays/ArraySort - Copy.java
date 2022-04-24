import java.util.Scanner;
public class ArraySort extends BigEleMat{
		static int[] printArrSort(int x[]) {
			int temp=0;
			for(int i=0;i<x.length;i++) {
				for(int j=i+1;j<x.length;j++) {
					if(x[i]>x[j]) {
						temp=x[j];
						x[j]=x[i];
						x[i]=temp;
					}
				}
			}
				return x;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<ar.length;i++) {
				ar[i]=sc.nextInt();
			}
				int res[]=printArrSort(ar);
				dispArr(res);
				sc.close();
	}

}
