
public class Transpose extends BigEleMat {
		static int[][] print_Transpose(int x[][]){
			int tr[][]=new int[x.length][x[0].length];
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<x[0].length;j++) {
					tr[i][j]=x[j][i];
				}
			}
				return tr;
		}
	public static void main(String[] args) {
		System.out.println("enter matrix size and elements");
		int ar[][]=readMatEle();
		int res[][]=print_Transpose(ar);
		System.out.println("Transpose of given matrix is:");
		displayMatEle(res);
	}

}
