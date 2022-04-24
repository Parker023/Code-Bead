
public class MatAdd extends BigEleMat {
		static int[][] matAddition(int e[][],int f[][]){
			if(e.length!=f.length||e[0].length!=f[0].length) {
				System.out.println("matrix addition not possible");
					return null;
			}
				int g[][]=new int[e.length][e[0].length];
			for(int i=0;i<e.length;i++) {
				for(int j=0;j<e[i].length;j++) {
					g[i][j]=e[i][j]+f[i][j];
				}
			}
				return g;
		}
	public static void main(String[] args) {
		
		System.out.println("enter first matrix size and elements");
			int f[][]=readMatEle();
			System.out.println("enter second matrix size and elements");
			int e[][]=readMatEle();
		int sum[][]=matAddition(e, f);
			displayMatEle(sum);
	}

}
