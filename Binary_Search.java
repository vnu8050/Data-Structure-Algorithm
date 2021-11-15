package DataStructure;

public class Binary_Search {
	  public static int search(int[] nums, int target) {
		      int low=0,high=nums.length-1;
	        while(low<high){
	            int mid = low + (high-low)/2;
	            if(target == nums[mid]){
	               return mid;
	            }else if(target<nums[mid]){
	                high = mid;
	            }else low = mid+1;
	        }
	        if(target != nums[low]) return -1;
	        return low;
	    }
	  
	  public static void main(String[] args) {
		  int arr[] = {-1,0,3,5,9,12};
		  int target = 12;
		System.out.println(search(arr,target));
	}
}
