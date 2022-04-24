//String Decryption : executed at 01:10 AM on 07-03-2022.
package org.Parker1.Shannu.App;
import java.util.LinkedList;
import java.util.Scanner;
public class StringFreqToWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		printWordReversedStringWithFreq(str);
		sc.close();
	}
	public static void printWordReversedStringWithFreq(String st) {
		LinkedList<String> list=new LinkedList<String>();
		char ch[]=st.toCharArray();int count=0;
		String val="0123456789";
		for(int j=ch.length-1;j>=0;j=j-count-1) {
			String k="";count=0;
			for(int i=j;i>=0;i--) {
				if(ch[i]==' ') {
					break;
				}
				if(ch[i]!=' ') {
					k=ch[i]+k;
					count++;
				}
			}
			char ch1[]=k.toCharArray();
			//	}
			for(int i=0;i<ch1.length;i++) {
				if(val.indexOf(ch1[i])!=-1) {
					String p="";
					//			System.out.println(" op     ");
					for(int x=0;x<ch1[i]-48-1;x++) {
						p=p+ch1[i-1];
					}
					list.add(p);
				}
				else 
					list.add(String.valueOf(ch1[i]));

				//				}
			}//inner loop
			list.add(" ");
		}//outer for loop
		Object str[]=list.toArray();
		for(Object e:str) {
			System.out.print(e);
		}
	}//method
}//class
