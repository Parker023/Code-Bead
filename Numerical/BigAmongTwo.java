import java.util.Scanner;

public class BigAmongTwo {
		 public static int biggest(int a,int b,int c){
			int res=(a>b&&a>c)?a:(b>c)?b:c;
			return res;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int op=biggest(x, y, z);
		System.out.println(op);
		sc.close();
}
	

}
