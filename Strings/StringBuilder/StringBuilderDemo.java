package org.Parker1.Shannu.Strings.stringBuilder;
public class StringBuilderDemo {
	public static void main(String[] args) {
		printString();
	}
	private static void printString() {
		StringBuilder s=new StringBuilder();
		char ch[]= {'a','n','i'};
		//			s.append(ch);
		//			s.append(false);
		s.append("anirudh");
		s.append(2.3);
		//			s.append(2);
		//			s.append(new StringBuilderDemo());
		//	System.out.println(s.append("shanmukha", 0, 9));
		s.appendCodePoint(65);//AAsci values as argument
		s.appendCodePoint(66);
		//			System.out.println(s.capacity());
		//			System.out.println(s.charAt(s.length()-1));
		//		System.out.println(s.codePointAt(s.length()-1));
		//			System.out.println(s.codePointBefore(s.length()));
			System.out.println(s.codePointCount(1, 3));
		System.out.println(s);
		//			System.out.println(new String(ch));
	}
}
