import java.util.Scanner;

public class Prime {
	
		public void isPrime(int n){
			int count=0;
			for(int i=2;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					if(i%j==0)
						count++;
				}
				 if(count==2)
					 System.out.print(i+" ");
					 count=0;				 	
}
			}		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			Prime p=new Prime();
			p.isPrime(x);
			sc.close();
	}

}
