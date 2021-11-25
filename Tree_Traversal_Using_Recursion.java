package DataStructure;

class Node1{
	int key;
	Node1 left, right;
	
	public Node1(int key) {
		this.key = key;
		left = right = null;
	}
}
public class Tree_Traversal_Using_Recursion {
	public static void pre_Order(Node1 root) {
		if(root==null) return;
		System.out.print(root.key+" ");
		pre_Order(root.left);
		pre_Order(root.right);
	}
	public static void in_Order(Node1 root) {
		if(root==null) return;
		in_Order(root.left);
		System.out.print(root.key+" ");
		in_Order(root.right);
	}
	public static void post_Order(Node1 root) {
		if(root==null) return;
		post_Order(root.left);
		post_Order(root.right);
		System.out.print(root.key+" ");
	}
	public static void main(String[] args) {
		Node1 root = new Node1(10);
		root.left = new Node1(20);
		root.right = new Node1(30);
		root.left.left = new Node1(40);
		root.left.right = new Node1(50);
		root.right.left = new Node1(60);
		root.right.right = new Node1(70);

		pre_Order(root);
		System.out.println();
		in_Order(root);
		System.out.println();
		post_Order(root);
	}
	
}
