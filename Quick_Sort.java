package DataStructure;

public class Quick_Sort {
	public static void main(String[] args) {
		int arr[] = {4,6,2,5,7,8,1,3};
		sort(arr,0,arr.length-1);
		 for(int i=0; i<arr.length; i++) {
	        	System.out.print(arr[i] +" ");
	        }
	}
	
	static void sort(int []arr, int start,int end) {
		if(start < end) {
			int pivot = quick(arr,start,end);
			sort(arr,start,pivot-1);
			sort(arr,pivot+1,end);
		}
	}
	
	static int quick(int arr[], int start, int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		
		while(i < j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = pivot;
		pivot = arr[j];
		arr[j] = temp;
		
		return j;
	}
}
