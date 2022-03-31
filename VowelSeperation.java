package org.Parker1.Shannu.Strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
public class VowelSeperation {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String st=br.readLine();
	System.out.println(vowelTransformation(st));
}
private static String vowelTransformation(String st) {
	LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
	String check="aeiou";
	for(int i=0;i<st.length();i++) {
		if(check.indexOf(st.charAt(i))!=-1)
			lhs.add(st.charAt(i));
	}String k="";
				for(Character e :lhs)
					k=k+e+" ";
				return k;
}
}
