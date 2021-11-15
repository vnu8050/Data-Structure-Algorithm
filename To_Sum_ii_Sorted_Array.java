package DataStructure;

public class To_Sum_ii_Sorted_Array {
public static int[] twoSum(int[] numbers, int target) {
        int start=0, end = numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end] < target){
                start++;
            }else if(numbers[start]+numbers[end] > target){
                end--;
            }else {
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{};
    }

public static void main(String[] args) {
	int arr[] = {2,7,11,15};
	int target =18;
	System.out.println(twoSum(arr,target));
}
}
