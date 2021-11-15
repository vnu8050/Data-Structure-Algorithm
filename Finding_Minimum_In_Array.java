package DataStructure;

public class Finding_Minimum_In_Array {
public static void main(String[] args) {
	int arr[] = {11,22,6,7,8};
	int n = arr.length;
	System.out.println(minimum(arr, n));
}
static int minimum(int[] arr,int len) {
	if(len == 1) return arr[0];
	return Math.min(arr[len-1], minimum(arr,len-1));
	
}
}
