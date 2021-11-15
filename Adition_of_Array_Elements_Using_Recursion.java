package DataStructure;

public class Adition_of_Array_Elements_Using_Recursion {
public static void main(String[] args) {
	int[] arr = {2,4,6,8,10,20};
	int n = arr.length;
	System.out.println(recursion_add(arr,n));
}
static int recursion_add(int[] arr, int length) {
	if(length<=0) {
		return 0;
	}
	return (recursion_add(arr,length-1) + arr[length-1]);
}
}
