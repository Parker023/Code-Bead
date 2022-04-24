import java.util.Scanner;

public class StudentResults {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,p,c,e,avg;
		
		m=sc.nextInt();
		p=sc.nextInt();
		c=sc.nextInt();
		e=sc.nextInt();
		avg=m+p+c+e/400;
		if(m>=35&&p>=35&&c>=35&&e>=35) {
			System.out.println("pass");
			if(avg>=350)
				System.out.println("distinction");
			else if(avg>=250&&avg<350)
				System.out.println("1st class");
			else if(avg>=140&&avg<250)
				System.out.println("2nd class");
		}
			
		else if(m>35||p>35||c>35||e>35)
			System.out.println("fail");
		sc.close();
	}

}
