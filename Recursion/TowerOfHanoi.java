package org.Parker1.Shannu.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	tw_Move(n,'S','T','D');
	sc.close();
}

private static void tw_Move(int n, char src, char temp, char dst) {
	if(n==1) {
		System.out.println("Disk "+n+" move from "+src+" to "+dst);
		return;
	}
	tw_Move(n-1, src, dst, temp);
	System.out.println("Disk "+n+" move from "+src+" to "+dst);
	tw_Move(n-1, temp, src, dst);
}
}
