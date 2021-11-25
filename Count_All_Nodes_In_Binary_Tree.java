package DataStructure;

public class Count_All_Nodes_In_Binary_Tree {
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
		System.out.println(countnodes(root));
}
	public static int countnodes(Node2 root) {
		if(root == null) return 0;
		
		return 1+countnodes(root.left)+countnodes(root.right);
	}
}