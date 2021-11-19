package DataStructure;

public class Sorting_0s_1s_2s_In_Array {
	
	 public static void main(String[] args) {
			int nums[] = {2,0,2,1,1,0,2,1,1,0};
	 if(nums.length == 0 || nums.length == 1) return;
		    
	        int index = 0;
	        int start = 0;
	        int end = nums.length-1;
	        
	        while(index <= end && start < end){
	            if(nums[index] == 0){
	            	nums[index] = nums[start];
	                nums[start] = 0;
	                start++;
	                index++;
	            }else if(nums[index] == 2){
	            	nums[index] = nums[end];
	                nums[end] = 2;
	                end--;
	            }else{
	                index++;
	           }
	        }
	        
	        for(int i=0;i<nums.length;i++) {
	        	System.out.print(nums[i]+ " ");
	        }
	    }
}
