package DataStructure;

public class Majority_Element_In_Array_Using_Binary_Search {
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = nums[0];
        int count = 1;
        
        for(int i=1;i<n;i++){
            if(nums[i] == majority){
                count++;
            }else{
                count--;
                if(count == 0){
                    majority = nums[i];
                    count=1;
                }
            }
        }
        return majority;
    }
	public static void main(String[] args) {
		int nums[] = {3,2,3,2,3};
		System.out.println(majorityElement(nums));
	}
}
