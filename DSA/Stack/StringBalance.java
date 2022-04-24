package dsa.stack;
import java.util.*;
public class StringBalance<T> {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(isBalanced(s))
			System.out.println("balanced");
		else
			System.out.println("not balanced");
		sc.close();
	}
	private static boolean isBalanced(String s) {
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='(')
				stk.push(s.charAt(i));
			else if(s.charAt(i)==']'&&stk.pop()!='[')
				return false;
			else if(s.charAt(i)=='}'&&stk.pop()!='{')
				return false;
			else if(s.charAt(i)==')'&&stk.pop()!='(')
				return false;
		}
		return stk.isEmpty();
	}
}
