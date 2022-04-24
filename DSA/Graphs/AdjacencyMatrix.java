package dsa.graphs;

import java.util.*;
public class AdjacencyMatrix {
	int ar[][];
	int v,e;
	public AdjacencyMatrix(int nodes) {
		ar=new int[nodes][nodes];
		v=nodes;
		e=0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of nodes");
		int nodes =sc.nextInt();
		AdjacencyMatrix am=new AdjacencyMatrix(nodes);
		am.addEdge(0, 1);
		am.addEdge(1, 2);
		am.addEdge(2, 3);
		am.addEdge(3, 0);
		System.out.println(am);
		sc.close();
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(v+"  vertices and "+e+" edges"+"\n");
		for(int i=0;i<v;i++) {
			sb.append(i+":    ");
			for (int is : ar[i]) {
				sb.append(is+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	private  void addEdge(int i, int j) {
		ar[i][j]=1;
		ar[j][i]=1;
		e++;
	}
}
