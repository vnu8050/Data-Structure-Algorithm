package DataStructure;

public class Merge_Sort {
	public static void main(String[] args) {
		int arr[] = {4,6,2,5,7,8,1,3};
		sort(arr, 0, arr.length - 1);
        for(int i=0; i<arr.length; i++) {
        	System.out.print(arr[i] +" ");
        }
  }
	
	static void sort(int []arr, int start,int end) {
		if(start < end) {
			int mid = start + (end-start)/2;
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	static void merge(int []arr,int start,int mid,int end) {
		int len1 = mid-start+1;
		int len2 = end-mid;
		
		int res1[] = new int[len1];
		int res2[] = new int[len2];
		
		for(int i=0; i<len1; i++) {
			res1[i] = arr[start+i];
		}
		for(int i=0; i<len2; i++) {
			res2[i] = arr[mid+i+1];
		}
		int i = 0, j = 0;
		int k = start;
		while(i<len1 && j<len2) {
			
			if(res1[i] <= res2[j]) {
				arr[k] = res1[i];
				i++;
			}
			else {
				arr[k] = res2[j];
				j++;
			}
			k++;
		}
		while(i<len1) {
			arr[k] = res1[i];
			k++;
			i++;
		}
		while(j<len2) {
			arr[k] = res2[j];
			j++;
			k++;
		}
	}
}
