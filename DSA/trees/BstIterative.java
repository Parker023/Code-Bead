package dsa.Trees.bst;

public class BstIterative{
class Node{
	int data;
	Node right,left;
	Node(int data){
		this.data=data;
	}
}
static Node root;
public boolean insert(int data) {
	Node n=new Node(data);
	if(root==null) {
		root=n;
		return true;
	}
	Node temp=root;
	while(temp!=null) {
	if(data<temp.data) {
		if(temp.left==null) {
			temp.left=n;
			return true;
		}
		temp=temp.left;
	}
	else if(data>temp.data) {
		if(temp.right==null) {
			temp.right=n;
			return true;
		}
		temp=temp.right;
	}
	else
		return false;
	}
	return false;
}
	public void postOrder(Node t) {
		if(t==null)
			return;
		postOrder(t.left);
		postOrder(t.right);
		System.out.print(t.data+" ");
	}
	public void preOrder(Node t) {
		if(t==null)
			return;
		System.out.print(t.data+" ");
		preOrder(t.left);
		preOrder(t.right);
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
		BstIterative bi=new BstIterative();
		bi.insert(15);
		bi.insert(8);
		bi.insert(18);
		bi.insert(3);
		bi.insert(4);
		bi.insert(22);
		bi.postOrder(root);
		System.out.println();
		System.out.println("preOrder");
		bi.preOrder(root);
		System.out.println(bi.isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
}
