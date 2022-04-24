import java.util.*;

public class DeleteElementsInArr extends MergeArray {
		static int [] deleteEle(int x[],int position) {
			if(position<0&&position>=x.length) {
				System.out.println("position not valid");
				return x;
			}
			int d[]=new int[x.length-1];
			for(int i=0;i<d.length;i++) {
				if(i<position) {
					d[i]=x[i];
				}
				else
					d[i]=x[i+1];
			}
				return d;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x[]=readArr();
		
		int p=sc.nextInt();
		int res[]=deleteEle(x, p);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		sc.close();
	}

}
