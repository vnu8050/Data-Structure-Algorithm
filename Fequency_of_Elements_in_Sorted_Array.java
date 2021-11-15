package DataStructure;

public class Fequency_of_Elements_in_Sorted_Array {
	
	static int lower_bound(int arr[],int target) {
		int low=0,high=arr.length-1;
		while(low<high) {
			int mid = low + (high-low)/2;
			
			if(target<=arr[mid]) {
				high=mid;
			}else low=mid+1;
		}
		if(arr[low]!=target) return -1;
		
		return low;
	}
	
	static int upper_bound(int arr[],int target) {
		int low=0,high=arr.length-1;
		while(low<high) {
			int mid = low + (high-low)/2;
			
			if(target>=arr[mid]) {
				low=mid+1;
			}else high=mid;
		}
	//	if(high==-1 || arr[high]!=target) return -1;
		return low;
	}
	
public static void main(String[] args) {
	int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
	int target = 6;
	int lower_index = lower_bound(arr,target);
	int upper_index = upper_bound(arr,target);
	int frequency = (upper_index - lower_index);
	System.out.println("Frequency of target element : "+ frequency);
}
}
