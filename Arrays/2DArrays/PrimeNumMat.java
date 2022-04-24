
public class PrimeNumMat extends BigEleMat{
		static int printNumOfPrime(int [][]x) {
			int count=0;
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<x[i].length;j++) {				
						boolean rs=isPrime(x[i][j]);
						if(rs==true)
							count++;
					}
			}	
						return count;
		}
		static boolean isPrime(int n) {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					return false;
			}
				return true;
		}
	public static void main(String[] args) {
	int y[][]=readMatEle();
			int pcount=printNumOfPrime(y);
			System.out.println(" number of primes in matrix: "+pcount);
	}
}
