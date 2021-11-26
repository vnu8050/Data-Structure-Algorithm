package DataStructure;

public class Print_Right_Nodes_Using_Recursion {
static int count = 0;
	
	public static void main(String[] args) {
		Node2 root = new Node2(1);
		root.left = new Node2(2);
		root.right = new Node2(3);
		root.left.left = new Node2(4);
		root.right.left = new Node2(5);
		root.right.left.right= new Node2(6);
		root.right.left.right.left= new Node2(7);
		
		right_Nodes(root, 0);
	}
	private static void right_Nodes(Node2 root, int current) {
		if(root == null) return;
		
		if(current>=count) {
			System.out.println(root.key);
			count++;
		}
		
		right_Nodes(root.right, current+1);
		right_Nodes(root.left, current+1);
		
	}
}
