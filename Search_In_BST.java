package DataStructure;

public class Search_In_BST {
	 public static TreeNode searchBST(TreeNode root, int val) {
         if(root==null)
          return null;
      if(root.val==val)
          return root; 
      else if(root.val>val)
          return searchBST(root.left,val);
      else
          return searchBST(root.right,val);  
 }
	 public static void main(String[] args) {
		 TreeNode root = new TreeNode(4);
			root.left = new TreeNode(2);
			root.right = new TreeNode(7);
			root.left.left = new TreeNode(1);
			root.left.right = new TreeNode(3);
			int val = 2;
	System.out.println(searchBST(root,val));
	 }
}
