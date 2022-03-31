package org.Parker1.Shannu.Strings;

public class StringQuery {
	int marks;
	String name;
	public StringQuery(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	public String toString() {
		return this.name+" "+this.marks;
	}
public static void main(String[] args) {
	StringQuery s1=new StringQuery(88,"ani");
	System.out.println(s1);
	StringQuery s2=new StringQuery(85,"hrushi") {
		public String toString() {
			return this.name;
		}
	};
	System.out.println(s2);
	
}
}
