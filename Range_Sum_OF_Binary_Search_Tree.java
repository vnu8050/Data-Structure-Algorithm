package DataStructure;

public class Range_Sum_OF_Binary_Search_Tree {
	 public static int rangeSumBST(TreeNode root, int low, int high) {
         if (root == null) return 0;
      if (root.val < low) return rangeSumBST(root.right, low, high);
      if (root.val > high) return rangeSumBST(root.left, low, high);
      return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
 
  }
	 public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(18);
		int low =7,high=15;
		System.out.println(rangeSumBST(root,low,high));
	 
	 }
}
