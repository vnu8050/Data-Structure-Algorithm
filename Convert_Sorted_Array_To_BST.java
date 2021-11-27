package DataStructure;

public class Convert_Sorted_Array_To_BST {
	 public static TreeNode sortedArrayToBST(int[] num) {
	    	if (num.length == 0)
				return null;
	 
			return sortedArrayToBST(num, 0, num.length - 1);
		}
	 
		public static TreeNode sortedArrayToBST(int[] num, int start, int end) {
			if (start > end)
				return null;
	 
			int mid = (start + end) / 2;
			TreeNode root = new TreeNode(num[mid]);
			root.left = sortedArrayToBST(num, start, mid - 1);
			root.right = sortedArrayToBST(num, mid + 1, end);
	 
			return root;
		  
	    }
		public static void main(String[] args) {
			
			 TreeNode root = new TreeNode(10); 
			 root.left = new TreeNode(5); 
			 root.right =new TreeNode(15); 
			 root.left.left = new TreeNode(3); 
			 root.left.right = new TreeNode(7); 
			 root.right.right = new TreeNode(18);
			 int nums[] = {-10,-3,0,5,9}; 
			System.out.println(sortedArrayToBST(nums));
		}
}
