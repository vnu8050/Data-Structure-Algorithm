package DataStructure;

import java.util.*;

public class Average_Of_Levels_In_Binary_Tree {
	  public static List<Double> averageOfLevels(TreeNode root) {
	       List<Double> result = new ArrayList<>();
	       LinkedList<TreeNode> q = new LinkedList<>();
	    
	    if(root == null) return result;
	    q.add(root);
	    while(!q.isEmpty()) {
	        int n = q.size();
	        double sum = 0.0;
	        for(int i = 0; i < n; i++) {
	            TreeNode node = q.poll();
	            sum += node.val;
	            if(node.left != null) q.offer(node.left);
	            if(node.right != null) q.offer(node.right);
	        }
	        result.add(sum / n);
	    }
	    return result;   
	    }
	  public static void main(String[] args) {
		  TreeNode root = new TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			root.left.left = new TreeNode(4);
			root.right.left = new TreeNode(5);
			root.right.left.right= new TreeNode(6);
			root.right.left.right.left= new TreeNode(7);
			
			System.out.println(averageOfLevels(root));
	}
}
