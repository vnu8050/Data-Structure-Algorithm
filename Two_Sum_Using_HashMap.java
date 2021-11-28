package DataStructure;

import java.util.HashMap;

public class Two_Sum_Using_HashMap {
	   public static int[] twoSum(int[] numbers, int target) {
	        
	        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	        for(int i = 0; i < numbers.length; i++){

	            Integer diff = (Integer)(target - numbers[i]);
	            if(hash.containsKey(diff)){
	                int toReturn[] = {hash.get(diff), i};
	                return toReturn;
	            }

	            hash.put(numbers[i], i);

	        }
	        
	        return null;
}
	   public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		System.out.println(twoSum(nums,target));
	}
}