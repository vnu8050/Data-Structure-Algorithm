package DataStructure;

public class Sum_of_All_Nodes_in_Binary_Tree {
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
	System.out.println(sum_nodes(root));
	}
	public static int sum_nodes(Node2 root) {
		if(root == null) return 0;
		
		int left = sum_nodes(root.left);
		int right = sum_nodes(root.right);
		
		return root.key+left+right;
	}
}
