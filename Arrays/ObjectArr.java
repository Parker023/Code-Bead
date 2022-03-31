package org.Parker1.Shannu.Arrays;
import java.util.LinkedList;
import java.util.List;
public class ObjectArr {
	static Object ar[]= {"abc",1,1,2,'d',4,8,5,'c',10,"anirudh",10};
	public static void main(String[] args) {
		int result=printArrNSum(ar);
		System.out.println(result);
	}
	public static int printArrNSum(Object a[]) {
		String ar[]=new String[a.length];
		List<String> list=new LinkedList<String>();int n;
		//converting object array to string array
		for(int i=0;i<a.length;i++) {
			ar[i]=a[i].toString();
		}
		//storing only int values
		for(int i=0;i<ar.length;i++) {
			try {
				n=Integer.parseInt(ar[i]);}
			catch (Exception e) {
				continue;
			}
			list.add(""+n+"");
		}for(String b:list)
			System.out.print(b+" ");
		System.out.println();
		//conversion of list to String array
		String arr[]=new String[list.size()];
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		int sum=0;
		boolean b[]=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(b[i]==true)
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if(b[j]==true)
					continue;
				if(arr[i].equals(arr[j])) {
					b[i]=true;
					b[j]=true;
				}
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]==false)
				sum=sum+Integer.parseInt(arr[i]);
		}
		return sum;
	}
}

