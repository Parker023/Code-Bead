package dsa.Trees.bst;
import dsa.Trees.binaryTree.BinaryTree;
public class BinarySearchTree {
	static Node root;
	static class Node{
		int data;
		Node right,left;
		Node(int data){
			this.data=data;
		}
	}
	public void insert(int value) {
		root=insert(root, value);
	}
	public Node insert(Node root,int value) {
		if(root==null) {
			root=new Node(value);
			return root;
		}
		if(value<root.data)
			root.left=insert(root.left, value);
		else
			root.right=insert(root.right, value);
		return root;
	}
	public void clear() {
		root=null;
	}
	public void preOrderTraversal(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public void inOrderTraversal(Node root) {
		if(root==null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}
	public Node search(int key) {
		return search(root,key);
	}
	private Node search(Node root, int key) {
		if(root==null||root.data==key) 
			return root;
		if(key<root.data)
			return search(root.left,key);
		else
			return search(root.right, key);
	}
	public boolean isValid(dsa.Trees.binaryTree.BinaryTree.Node root,int min,int max) {
		if(root==null)
			return true;
		if(root.data<=min||root.data>=max)
			return false;
		boolean left=isValid(root.left, min, root.data);
		if(left) {
			boolean right=isValid(root.right, root.data, max);
			return right;
		}
		return false;
	}
	public boolean isValid(Node root,int min,int max) {
		if(root==null)
			return true;
		if(root.data<=min||root.data>=max)
			return false;
		boolean left=isValid(root.left, min, root.data);
		if(left) {
			boolean right=isValid(root.right, root.data, max);
			return right;
		}
		return false;
	}
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(2);
		bst.insert(7);
		bst.insert(1);
		bst.insert(11);
		bst.insert(0);
		bst.clear();
		BinaryTree bt=new BinaryTree();
		dsa.Trees.binaryTree.BinaryTree.Node tree=BinaryTree.createTree();
		System.out.println("preorder");
		bst.preOrderTraversal(root);
		System.out.println();
		System.out.println("inorder");
		bst.inOrderTraversal(root);
		System.out.println();
		if(bst.search(7)!=null)
			System.out.println("key found !!!!");
		else
			System.out.println("key not found");
		if(bst.isValid(tree, Integer.MIN_VALUE, Integer.MAX_VALUE))
			System.out.println("Given tree is Binary search tree");
		else
			System.out.println("not a binary search tree");
	}
}
