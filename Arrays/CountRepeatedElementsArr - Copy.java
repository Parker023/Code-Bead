import java.util.*;
public class CountRepeatedElementsArr extends MergeArray {
		static void countEleArr(int x[]) {
			boolean r[]=new boolean[x.length];
			int count=1;
			
			for(int i=0;i<x.length;i++) {
				if(r[i]==true)
					continue;
				for(int j=i+1;j<x.length;j++) {
					if(x[i]==x[j]) {
						count++;
						r[j]=true;
					}	
				}
				System.out.println(x[i]+"->"+count);
			}
		}
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int a[]=readArr();
				countEleArr(a);
				sc.close();
	}

}
