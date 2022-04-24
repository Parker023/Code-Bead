package dsa.matrix;
import java.util.Scanner;
public class SpiralTraverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter No. of rows");
		int row=sc.nextInt();
		System.err.println("enter No. of columns");
		int column=sc.nextInt();
		System.out.println("enter "+row*column+" elements ");
		int a[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		spiralForm(a,row,column);
		sc.close();
	}
	private static void spiralForm(int[][] a, int r, int c) {
		int k=0,l=0;
		while(k<r&&l<c) {
			for(int i=l;i<c;i++) {
				System.out.print(a[k][i]+" ");
			}
			k++;
			for(int i=k;i<r;i++) {
				System.out.print(a[i][c-1]+" ");
			}
			c--;
			if(k<r) {
				for(int i=c-1;i>=l;i--) {
					System.out.print(a[r-1][i]+" ");
				}
				r--;
			}
			if(l<c) {
				for(int i=r-1;i>=k;i--) {
					System.out.print(a[i][l]+" ");
				}
				l++;
			}
		}
	}
}
