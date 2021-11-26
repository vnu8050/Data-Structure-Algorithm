package DataStructure;

import java.util.*;

public class Leaf_Similar_Trees {
	 public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
         List<Integer> leaves1 = new ArrayList();
    List<Integer> leaves2 = new ArrayList();
    dfs(root1, leaves1);
    dfs(root2, leaves2);
    return leaves1.equals(leaves2);
  }

  public static void dfs(TreeNode node, List<Integer> leafValues) {
    if (node != null) {
      if (node.left == null && node.right == null)
        leafValues.add(node.val);
      dfs(node.left, leafValues);
      dfs(node.right, leafValues);
    }
  
    }
  public static void main(String[] args) {
	  TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
	
		  TreeNode root2 = new TreeNode(6);
			root2.left = new TreeNode(7);
			root2.right = new TreeNode(8);
			root2.left.left = new TreeNode(9);
			root2.right.left = new TreeNode(10);
				
		System.out.println(leafSimilar(root,root2));
}
}
