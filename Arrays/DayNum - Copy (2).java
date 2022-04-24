import java.util.Scanner;

public class DayNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		String d[]= {"sun","mon","tues","wed","thurs","fri","sat"};
		System.out.println(d[i]);
		sc.close();
	}

}
