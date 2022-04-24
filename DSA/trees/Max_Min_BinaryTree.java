package dsa.Trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Max_Min_BinaryTree extends BinaryTree {
	public static void main(String[] args) {
		Node root=BinaryTree.createTree();
		System.out.println(findMax(root));
	}
	public static int  findMax(Node root) {	
		Queue<Node> q=new LinkedList<>();
		int max=0;
		q.offer(root);
			while(!q.isEmpty()) {
				Node temp=q.poll();
				if(temp.data>max)
					max=temp.data;
				if(temp.left!=null) 
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}
			return max;
	}
}
