
public class SumOfMatEle extends BigEleMat {
		static int checkSumOfMatEle(int [][]x) {
			int sum=0;
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<x[i].length;j++) {
					sum=sum+x[i][j];
				}
			}
				return sum;
		}
	public static void main(String[] args) {
			int mat[][]=readMatEle();
		int	totalsum= checkSumOfMatEle(mat);
		System.out.println(" sum of elements in a matrix: "+totalsum);
	}

}
