package dsa.graphs;
import java.util.*;
public class AdjacencyList {
	private LinkedList<Integer> ar[];
	private int v,e;
	@SuppressWarnings("unchecked")
	public AdjacencyList(int nodes) {
		ar=new LinkedList[nodes];
		v=nodes;
		e=0;
		for(int i=0;i<nodes;i++) {
			ar[i]=new LinkedList<Integer>();
		}
	}
	public static void main(String[] args) {
		AdjacencyList al=new AdjacencyList(5);
		al.addEdge(0, 1);
		al.addEdge(1, 2);
		al.addEdge(2, 3);
		al.addEdge(3, 0);
		al.addEdge(2, 4);
//		al.bfs(0);
		al.dfs(0);
		//		System.out.println(al);
	}

	public void bfs(int n) {//Breadth First Search
		boolean seen[]=new boolean[v];
		Queue<Integer> list=new LinkedList<Integer>();
		list.add(n);
		seen[n]=true;
		while(!list.isEmpty()) {
			int r=list.poll();
			System.out.print(r+" ");
			for(int x:ar[r]) {
				if(!seen[x]) {
					seen[x]=true;
					list.add(x);
				}
			}
		}
	}
	public void dfs(int n) {
		boolean b[]=new boolean[v];
		Stack<Integer> st=new Stack<Integer>();
		st.push(n);
		while(!st.isEmpty()) {
			int x=st.pop();
			if(!b[x]) {
				b[x]=true;
				System.out.print(x+" ");
				for(int s:ar[x]) {
					if(!b[s])
						st.push(s);
				}
			}
		}
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(v+" vertices and "+e+" edges"+"\n");
		for(int i=0;i<v;i++) {
			sb.append(i+":    ");
			for (int is : ar[i]) {
				sb.append(is+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	private void addEdge(int i, int j) {
		ar[i].add(j);
		ar[j].add(i);
		e++;
	}
}
