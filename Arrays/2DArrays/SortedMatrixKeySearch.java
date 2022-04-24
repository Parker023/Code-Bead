package dsa.matrix;

import java.util.Scanner;

public class SortedMatrixKeySearch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of nxn matrix: ");
	int n=sc.nextInt();
	int ar[][]=new int[n][n];
	System.out.println("enter "+n*n+" elements");
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			ar[i][j]=sc.nextInt();
		}
	}
	System.out.println("enter key");
	int key=sc.nextInt();
	keySearch(ar, key, n);
	sc.close();
}
public static void keySearch(int ar[][],int key,int n) {
	int i=0;
	int j=n-1;
	while(i<n&&j>=0) {
		if(ar[i][j]==key) {
			System.out.println("key found in row "+i+" column "+j);
				return;
		}
		if(key>ar[i][j])
			i++;
		else
			j--;
	}
}
}
