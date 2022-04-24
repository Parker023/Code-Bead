import java.util.Scanner;

public class XylemPhloem {
		static boolean isXylemPhloem(int n) {
			int ms=0,es=0;
			int d=n%10;
			es=es+d;
			n=n/10;
			while(n/10!=0) {
				int r=n%10;
				ms=ms+r;
				n=n/10;
			}
			es=es+n;
			return es==ms;	
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		boolean res=isXylemPhloem(v);
		if(res==true) {
			System.out.println("xylem");
			}
		else
			System.out.println("phloem");
		sc.close();
	}

}
