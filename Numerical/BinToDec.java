import java.util.Scanner;

public class BinToDec {
public	static int conversionBToD(int bin){
	int pw=1,sum=0;
			do{
				int d=bin%10;
				sum=sum+d*pw;
				pw=pw*2;
				bin=bin/10;
			}while(bin!=0);
				return sum;
		}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter binary number");
			int v=sc.nextInt();
			int res=conversionBToD(v);
			System.out.println("decimal equivalent is :"+res);
			sc.close();
	}

}
