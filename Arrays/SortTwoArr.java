import java.util.*;
public class SortTwoArr extends MergeArray{
		static int[] sortArr(int x[],int y[]) {
		int arr[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
			while(i<x.length&&j<y.length) {
				if(x[i]<y[j]) {
					arr[k]=x[i];
					i++;
					k++;
				}
				else {
					arr[k]=y[j];
					j++;
					k++;
				}
			}
				return arr;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int ar1[]=readArr();
			int ar2[]=readArr();
			int res[]=sortArr(ar1, ar2);
			dispArr(res);
			sc.close();
	}

}
