import java.util.*;
public class InsertElementsArr extends MergeArray {
		static int[] addElement(int x[],int position,int v) {
			int newar[]=new int[x.length+1];
			newar[position]=v;
			for(int i=0;i<x.length;i++) {
				if(i<position) {
					newar[i]=x[i];
				}
				else 
					newar[i+1]=x[i];
			}
				return newar;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=readArr();
		int v=sc.nextInt();
		int p=sc.nextInt();
		int res []=addElement(ar, v, p);
		dispArr(res);
		sc.close();
	}

}
