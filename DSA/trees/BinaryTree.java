package dsa.Trees.binaryTree;
import java.util.*;
public class BinaryTree {
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		sc=new Scanner(System.in);
		Node root=createTree();
		System.out.println("PreOrder traversal");
		bt.preOrder(root);
		System.out.println();
		System.out.println("InOrder Traversal");
		bt.inOrder(root);
		System.out.println();
		System.out.println("PostOrder Traversal");
		bt.postOrder(root);
		System.out.println();
		System.out.println("LevelOrder Traversal");
		bt.levelOrder(root);
	}		
	static Scanner sc=new Scanner(System.in);

	public static class Node{
		public int data;
		public Node left;
		public Node right;
		public Node(int data) {
			this.data=data;
		}
	}
	public static Node createTree() {
		Node n=null;
		System.out.println("enter data");
		int data=sc.nextInt();
		if(data==-1)
			return null;
		n=new Node(data);
		System.out.println("enter left data of: "+data);
		n.left=createTree();
		System.out.println("enter right data of: "+data);
		n.right=createTree();
		return n;
	}
	public void preOrder(Node t) {
		if(t==null)
			return;
		System.out.print(t.data+" ");
		preOrder(t.left);
		preOrder(t.right);
	}
	public void inOrder(Node t) {
		if(t==null)
			return;
		inOrder(t.left);
		System.out.print(t.data+" ");
		inOrder(t.right);
	}
	public void postOrder(Node t) {
		if(t==null)
			return;
		postOrder(t.left);
		postOrder(t.right);
		System.out.print(t.data+" ");
	}
	public void levelOrder(Node t) {
		if(t==null)
			return;
		Queue<Node> que=new LinkedList<>();
		que.offer(t);
		while(!que.isEmpty()) {
			Node temp=que.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				que.offer(temp.left);
			if(temp.right!=null)
				que.offer(temp.right);
		}
	}
}
