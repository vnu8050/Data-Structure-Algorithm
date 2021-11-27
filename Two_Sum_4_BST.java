package DataStructure;

import java.util.Stack;

public class Two_Sum_4_BST {
	public static boolean findTarget(TreeNode root, int k) {
	      Stack<TreeNode> stackL = new Stack<TreeNode>();  
	        Stack<TreeNode> stackR = new Stack<TreeNode>();         
	        for(TreeNode cur = root; cur != null; cur = cur.left)  
	            stackL.push(cur);
	        for(TreeNode cur = root; cur != null; cur = cur.right)  
	            stackR.push(cur);
	            
	        while(stackL.size() != 0 && stackR.size() != 0 && stackL.peek() != stackR.peek()){
	            int tmpSum = stackL.peek().val + stackR.peek().val;
	            if(tmpSum == k)  return true;
	            else if(tmpSum < k)
	                for(TreeNode cur = stackL.pop().right; cur != null; cur = cur.left) 
	                    stackL.push(cur);
	            else
	                for(TreeNode cur = stackR.pop().left; cur != null; cur = cur.right) 
	                    stackR.push(cur);
	        }
	        
	        return false;   
	    }
	public static void main(String[] args) {
		 TreeNode root = new TreeNode(5);
			root.left = new TreeNode(3);
			root.right = new TreeNode(6);
			root.left.left = new TreeNode(2);
			root.left.right = new TreeNode(4);
			root.right.right = new TreeNode(7);
			int val =9;
			System.out.println(findTarget(root,val));
	}
}
