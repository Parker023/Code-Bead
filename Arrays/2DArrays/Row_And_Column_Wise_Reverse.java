
public class Row_And_Column_Wise_Reverse extends BigEleMat {
		static int[][] print_Row_Wise_Reverse(int x[][]) {
			int temp=0;
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<x[0].length/2;j++) {
					temp=x[i][j];
					x[i][j]=x[i][x[0].length-1-j];
					x[i][x[0].length-1-j]=temp;
				}
			}
				return x;
		}
		static int[][] print_col_Wise_Reverse(int x[][]) {
			int temp=0;
			for(int i=0;i<x.length/2;i++) {
				for(int j=0;j<x[i].length;j++) {
					temp=x[i][j];
					x[i][j]=x[x.length-1-i][j];
					x[x.length-1-i][j]=temp;
				}
			}
				return x;
		}
	public static void main(String[] args) {
		System.out.println("enter matrix size and elements");
			int a[][]=readMatEle();
			int rowrev[][]=print_Row_Wise_Reverse(a);
			System.out.println("Row wise reverse of given matrix is:");
			displayMatEle(rowrev);
			int colrev[][]=print_col_Wise_Reverse(a);
			System.out.println("Col wise reverse of given matrix is:");
			displayMatEle(colrev);

			
	}

}
