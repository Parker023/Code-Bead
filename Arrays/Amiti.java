package org.Parker1.Shannu.Arrays;

import java.util.TreeSet;

public class Amiti {
public static void main(String[] args) {
	int sum=0;
	TreeSet<Integer> ts=new TreeSet<Integer>();
	Object ar[]= {"abc",1,2,2,10,4,'l',10};
	for(Object o:ar) {
		if(o instanceof Integer) {
			boolean rs=ts.add((Integer)o);
			if(rs)
				sum=sum+(Integer)o;
			else
				sum=sum-(Integer)o;
		}
	}
	System.out.println(sum);
}
}
