
public class RowAndColAndDiagWiseBig extends BigEleMat  {
	static int[] check_Big_Row(int x[][]) {
		int big[]=new int[x.length];
		for(int i=0;i<x.length;i++) {
			big[i]=x[i][0];
			for(int j=1;j<x[i].length;j++) {
				if(x[i][j]>big[i])
					big[i]=x[i][j];
					
			}
		}
	       return big;
	}
	static int[] check_Big_Col(int x[][]) {
		int big[]=new int[x[0].length];
		for(int i=0;i<x[0].length;i++) {
			big[i]=x[0][i];
			for(int j=0;j<x.length;j++) {
				if(x[j][i]>big[i])
					big[i]=x[j][i];
			}
		}
	       return big;
	}
	static int[] check_Big_Diag(int y[][]) {
			int ar[]= {y[0][0],y[0][y.length-1]};
			for(int i=0;i<y.length;i++) {
				for(int j=0;j<y[0].length;j++) {
					if(i==j&&y[i][j]>ar[0])
						ar[0]=y[i][j];
					else if(i+j==y.length-1&&y[i][j]>ar[1])
						ar[1]=y[i][j];
				}
			}
				return ar;
	}
	public static void main(String[] args) {
		System.out.println("enter matrix size and elements");
		int a[][]=readMatEle();
		System.out.println(" row wise big elements: ");
		int rowbig[]=check_Big_Row(a);
		dispArr(rowbig);
		int colbig[]=check_Big_Col(a);
		System.out.println(" Column wise big elements: ");
		dispArr(colbig);
		int diagbig[]=check_Big_Diag(a);
		System.out.println(" Diagonal wise big elements: ");
		dispArr(diagbig);
		
	
		
	}

}
