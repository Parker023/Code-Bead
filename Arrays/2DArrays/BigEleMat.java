
import java.util.*;
public class BigEleMat {
	static int[][] readMatEle(){
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number of rows and columns: ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println(" enter "+row*col +" elements in  row wise ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		return mat;
	}
	static void displayMatEle(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		
			}
	
	static int checkBigEleMat(int[][]x) {
		int big=x[0][0];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(x[i][j]>big)
					big=x[i][j];
			}
		}
				return big;
	}
	static void dispArr(int x[]) {
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
	}
	public static void main(String[] args) {
			int x[][]=readMatEle();
			int res=checkBigEleMat(x);
			System.out.println(" biggest element in given  matrix is: "+res);
			
	}

}
