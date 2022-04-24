package org.Parker1.Shannu.Recursion;

import java.util.Scanner;

public class PalindromeStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		if(isPalindrome(n))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		sc.close();
	}
	private static boolean isPalindrome(String n) {
		return checkPalindrome(n,0,n.length()-1);
	}
	private static boolean checkPalindrome(String n, int i, int j) {
			if(i>=j)
				return true;
			if(n.charAt(i)!=n.charAt(j))
				return false;
		return  checkPalindrome(n, i+1, j-1);
	}
}
