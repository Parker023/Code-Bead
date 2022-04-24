import java.util.Scanner;

public class PatternPart5 {
		static void patternn(int n) {
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
					for(int j=1;j<=i;j++) {
						System.out.print("* ");
					}
				
					System.out.println();
			}
			
		}
		static void patternn1(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			}
		}
		
		static void patternn2(int n) {
			int k=0;
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
			for(int j=1;j<=2*i-1;j++) {
				k++;
				if(j<=i)
				System.out.print(k+" ");
				k--;
				if(j<i) 
					System.out.print(k+" ");	
			}
			
			System.out.println();
			}
		}
		
		
		static void patternn3(int n) {
			int k=1;
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
			for(int j=1;j<=2*i-1;j++) {
				
				System.out.print(k%2+" ");
				k++;
			}
			
			System.out.println();
			}
		}
		
		
		static void patternn4(int n) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
					for(int j=1;j<=i;j++) {
						System.out.print(j+" ");
						if(j<i)
							System.out.print("* ");
					}
					System.out.println();
			}
			System.out.println();
		}
		
		
		static void patternn5(int n) {
			for(int i=n;i>=1;i--) {
				
				for(int j=1;j<=n-i;j++) {
					System.out.print("  ");
				}
					for(int j=1;j<=2*i-1;j++) {
						System.out.print("* ");
					}
				
					System.out.println();
			}
			
		}
		
		
		static void patternn6(int n) {
			int star=1,space=n/2;
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++){
					System.out.print("  ");
				}
				
					
				
				for(int j=1;j<=star;j++) {
					System.out.print("* ");
				}
					if(i<=n/2) {
						space--;
						star=star+2;
	            }
					else {
						space++;
						star=star-2;
					}
					System.out.println();
			}
				
		}
		
		
		static void patternn7(int n) {
			int k=n,space=0;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print("  ");
				}
					for(int j=1;j<=k;j++) {
						System.out.print("* ");
					}
						if(i<=n/2) {
							k=k-2;
							space++;
						}
						else {
							k=k+2;
							space--;
						}
							System.out.println();
			}
				System.out.println();
		}
		
		static void patternn8(int n) {
			int space=0;int x=n;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print("  ");
				}
				int k=1;
				for(int j=1;j<=x;j++) {
					System.out.print(k+" ");
				
					if(j<=n/2) {
						k++;
					}
					else
						k--;
					}
					if(i<=n/2) {
						space++;
						x=x-2;
					}
					else {
						space--;
						x=x+2;
					}
					System.out.println();
			}
			System.out.println();
		}
		
			static void patternn9(int n) {
				int space=0,k=n;
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=space;j++) {
						System.out.print("  ");
					}
					int x=k/2+1;
					for(int j=1;j<=k;j++) {
						System.out.print(x+" ");
						if(j<=k/2) 
							x--;
						else
							x++;
					}
					if(i<=n/2) {
						space++;
						k=k-2;
					}
					else {
						space--;
						k=k+2;
					}
					System.out.println();
				}
				System.out.println();
			}
		
	public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					int v=sc.nextInt();
					patternn(v);
					patternn1(v);
					patternn2(v);
					patternn3(v);
					patternn4(v);
					patternn5(v);
					patternn6(v);
					patternn7(v);
					patternn8(v);
					patternn9(v);
					sc.close();
	}

}
