package DataStructure;

public class First_and_Last_Occureance {
	
	public static void main(String[] args) {
			int[] nums = {2,2,6,6,6,7,8};
			int target = 1;
		System.out.println(searchRange(nums,target));
	}
	 public static int[] searchRange(int[] nums, int target) {
	        int result[] = new int[2];
	        result[0] = first_occurance(nums,target);
	        result[1] = last_occurance(nums,target);
	        return result;
	    }
	    
	    public static int first_occurance(int[] nums,int target){
	        int index = -1;
	        int start = 0;
	        int end = nums.length-1;
	        
	        while(start<=end){
	            int mid = end + (start-end)/2;
	            if(nums[mid] == target) index = mid;
	            if(nums[mid] >= target){
	                end = mid-1;
	            }else{
	                start = mid+1;
	            }   
	        }
	        return index;
	    }
	    
	       public static int last_occurance(int[] nums,int target){
	        int index = -1;
	        int start = 0;
	        int end = nums.length-1;
	        
	        while(start<=end){
	            int mid = end + (start-end)/2;
	            if(nums[mid] == target) index = mid;
	            if(nums[mid] <= target){
	                start = mid+1;
	            }else{
	                end = mid-1;
	            }   
	        }
	        return index;
	    }

}
