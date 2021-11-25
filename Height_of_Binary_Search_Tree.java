package DataStructure;
class Node2{
	int key;
	Node2 left, right;
	
	public Node2(int key) {
		this.key = key;
		left = right = null;
	}
}
public class Height_of_Binary_Search_Tree {
	public static void main(String[] args) {
		Node2 root = new Node2(10);
		root.left = new Node2(20);
		root.right = new Node2(30);
		root.left.left = new Node2(40);
		root.left.right = new Node2(50);
		root.right.left = new Node2(60);
		root.right.right = new Node2(70);
		root.left.right.left = new Node2(35);
		root.left.right.right = new Node2(45);
		root.left.left.right = new Node2(55);
		root.right.right.right = new Node2(25);
		
		System.out.println(heightbst(root));
	}
	public static int heightbst(Node2 root) {
		if(root == null) return -1;
		int leftHeight = heightbst(root.left);
		int rightHeight = heightbst(root.right);
		
		return 1+Math.max(leftHeight, rightHeight);
	}
}