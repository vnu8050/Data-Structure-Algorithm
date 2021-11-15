package DataStructure;

import java.util.Arrays;

public class Check_Array_Contain_Duplicate_Using_Binary_Search {
public static boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
public static void main(String[] args) {
	int[] nums = {1,2,3,1};
	System.out.println(containsDuplicate(nums));
}
}
