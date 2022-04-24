package org.Parker1.Shannu.App;

import java.util.Scanner;

public class MatrixMultiplication   {
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
	public static int[][] printMatrixMultiplication(int x[][],int y[][]) {
		if(x[0].length!=y.length) {
			System.out.println("matrix multiplication not possible");
		}
		
		int z[][]=new int[x.length][y[0].length];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y[0].length;j++) {
				int sum=0;
				for(int k=0;k<x[0].length;k++) {
					sum=sum+x[i][k]*y[k][j];
				}
				z[i][j]=sum;
			}
		}
		return z;
	}
	
	public static void main(String[] args) {
		int x[][]=readMatEle();
		int y[][]=readMatEle();
		int res[][]=printMatrixMultiplication(x, y);
		System.out.println("multiplicated matrix:");
		displayMatEle(res);
	}
}
