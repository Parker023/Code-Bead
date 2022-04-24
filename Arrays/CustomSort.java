package org.Babu_N_Sons.BabuApp.Plist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CustomSort {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++) {
		ar[i]=Integer.parseInt(br.readLine());
	}
	Integer arr[]=new Integer[n];
	for(int i=0;i<ar.length;i++) {
		arr[i]=ar[i];
	}
	
	Arrays.sort(arr, (i,j)->i%10<j%10?1:-1);//lambda ex
	int k=0;
	while(k<arr.length) {
		System.out.println(arr[k]);
		k++;
	}
	}
}
