
public class DeleteRepeatedElementsArr extends MergeArray {
		static int[] redundancy(int x[]) {
			int k=0;
			boolean b[]=new boolean[x.length];
			for(int i=0;i<x.length;i++) {
				if(b[i]==true) 
					continue;
				for(int j=i+1;j<x.length;j++) {
					if(x[i]==x[j])
					b[j]=true;
				}
			x[k]=x[i];
			k++;
			}
			int newar[]=new int[k];
			for(int i=0;i<k;i++) {
				newar[i]=x[i];
			}
				return newar;
		}
	public static void main(String[] args) {
		
		int a[]=readArr();
		int res[]=redundancy(a);
		dispArr(res);
	}

}
