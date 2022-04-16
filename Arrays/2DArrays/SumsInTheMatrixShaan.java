package org.Parker1.Shannu.Arrays.twoDArray;

import java.util.Scanner;

public class SumsInTheMatrixShaan {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int m=sc.nextInt();
			int n=sc.nextInt();
			int ar[][]=new int[m][n];
			System.out.println("enter elements");
			for(int i=0;i<ar.length;i++) {
				for(int j=0;j<ar[0].length;j++) {
					ar[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter no of queries");
			int noQuery=sc.nextInt();
			int i=0;
			while(i<noQuery) {
				System.out.println("enter low and high range");
				matrixQuery(ar,sc.nextInt(),sc.nextInt());
				i++;
			}
			sc.close();
		}

		private static void matrixQuery(int[][] ar, int l, int h) {
					int count=0;
					for(int i=0;i<ar.length;i++) {
						int sum=0;
						for(int j=0;j<ar[0].length;j++) {
							sum=sum+ar[i][j];
						}
						if(sum>=l&&sum<=h)
							count++;
					}
					for(int i=0;i<ar[0].length;i++) {
						int sum=0;
						for(int j=0;j<ar.length;j++) {
							sum=sum+ar[j][i];
						}
						if(sum>=l&&sum<=h)
							count++;
					}
					 System.out.print(count+" ");
		}
}
