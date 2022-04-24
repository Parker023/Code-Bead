
public class NumberOfEvenOddMat extends BigEleMat{
		static int[] checkNumOfEvenOddMat(int x[][]) {
			int even=0,odd=0;
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<x[i].length;j++) {
					if(x[i][j]%2!=0)
						odd++;
					else
						even++;
				}
			}
				int res[]= {odd,even};
				return res;
		}
		
	public static void main(String[] args) {
		int mat[][]=readMatEle();
		int result[]=checkNumOfEvenOddMat(mat);
		System.out.println(" count of even numbers in matrix: "+result[1]);
		System.out.println(" count of odd numbers in matrix: "+result[0]);

	}

}
