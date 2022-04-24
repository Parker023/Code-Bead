package org.Parker1.Shannu.Threads;

public class Test {
public static void main(String[] args)  {
	try {
		Class.forName("org.Parker1.Shannu.Threads.ClassLoad");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
