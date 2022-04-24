import java.util.Scanner;

public class DecToOct {
	public static String conversionDToO(int dec){
			String sum="";
			do {
				int d=dec%8;
				sum=d+sum;
				dec=dec/8;
			}while(dec!=0);
				return sum;
		}
	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a decimal number");
			int x=sc.nextInt();
			String res=conversionDToO(x);
			System.out.println("octal equivalent is:"+res);
			sc.close();
	}

}
