package DataStructure;

public class Print_kth_Node_For_a_Binary_Tree {
	public static void main(String[] args) {
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.right.left = new Node2(5);
		root.right.left.right= new Node2(6);
		root.right.left.right.left= new Node2(7);
		
		printkLevel(root, 1);
	}
	private static void printkLevel(Node2 root, int K) {
		if(root == null) return;
		
		if(K==0) {
			System.out.println(root.key);
		}
		
		printkLevel(root.left, --K);
		printkLevel(root.right, K);
	}
}
