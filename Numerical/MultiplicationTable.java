package org.Parker1.Shannu.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int v=Integer.parseInt(br.readLine());
		printTable(n, v);
		br.close();
	}
	
	static void printTable(int n,int v) {
		for(int i=1;i<=v;i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}
}
