package org.Parker1.Shannu.App;

import java.util.Arrays;
import java.util.Scanner;
//sort the given array and return 1 if all the elements in array are consecutive else 0
public class ArrConsecutive {
		static int checkConsecutive(int x[]) {
			Arrays.sort(x);
			for(int i=0;i<x.length-1;i++) {
				if(x[i+1]-x[i]!=1)
					return 0;
			}
			return 1;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int x[]=new int[n];
			for(int i=0;i<x.length;i++) {
				x[i]=sc.nextInt();
			}
			int res=checkConsecutive(x);
			System.out.println(res);
	}

}
