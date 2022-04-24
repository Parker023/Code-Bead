import java.util.Scanner;

public class Sum_Of_Neighbour_Ele_Mat extends BigEleMat {
	static int print_Neighbour_Ele_Sum(int n,int x[][]) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[0].length;j++) {
				if(n==x[i][j]) {
					if(j==0) 
						sum=sum+x[i-1][j]+x[i-1][j+1]+x[i][j+1]+x[i+1][j]+x[i+1][j+1];
					else if(j==x[0].length-1)
						sum=sum+x[i-1][j]+x[i-1][j-1]+x[i][j-1]+x[i+1][j-1]+x[i+1][j];
					else if(i==0)
						sum=sum+x[i][j-1]+x[i][j+1]+x[i+1][j-1]+x[i+1][j]+x[i+1][j+1];
					else if(i==x.length-1)
						sum=sum+x[i-1][j-1]+x[i-1][j]+x[i-1][j+1]+x[i][j-1]+x[i][j+1];
					else if(i==0&&j==0)
						sum=sum+x[i+1][j]+x[i+1][j+1]+x[i][j+1];
					else if(i==0&&j==x[0].length-1)
						sum=sum+x[i+1][j]+x[i+1][j-1]+x[i][j-1];
					else if(i==x.length-1&&j==0)
						sum=sum+x[i-1][j]+x[i-1][j+1]+x[i][j+1];
					else if(i==x.length-1&&j==x[0].length-1)
						sum=sum+x[i-1][j-1]+x[i-1][j]+x[i][j-1];
					else
						sum=sum+x[i-1][j-1]+x[i-1][j]+x[i-1][j+1]+x[i][j-1]+x[i][j+1]+x[i+1][j-1]+x[i+1][j]+x[i+1][j+1];
				}
			}
		}
				return sum;
	}
	public static void main(String[] args) {
			int x[][]=readMatEle();
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int neighnoursum=print_Neighbour_Ele_Sum(n, x);
			System.out.println(neighnoursum);
			sc.close();
	}

}
