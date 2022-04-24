package org.Parker1.Shannu.Numerical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class CountBits {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		printBitPosition(n);
	}
	static	public void printBitPosition(int n) {
		List<Integer> list=new ArrayList<Integer>();
		String k="";
		do {
			int d=n%2;
			k=d+k;
			n=n/2;
		}while(n!=0);
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)=='1') {
				list.add(i+1);}
		}
		System.out.println(list.size());
		for(Integer a:list)
			System.out.println(a);
	}
}
