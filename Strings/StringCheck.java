package org.Parker1.Shannu.Strings;

public class StringCheck {
//private static int count;
public static void main(String[] args) {
	String st="my name$is$Shanmukha Anirudh$ok";
	String str[]=st.trim().split("\\$");
	for(String e:str)
		System.out.println(e);
	}
}

