import java.util.*;
public class FrequencyOfCharInString {
		static void freqOfChar(String str) {
			int count[]=new int[128];
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				count[ch]++;
			}
				for(int i=0;i<count.length;i++) {
					if(count[i]!=0) {
						System.out.println((char)(i)+"->"+count[i]);
					}
				}
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String n=sc.nextLine();
			freqOfChar(n);
			sc.close();
	}

}
