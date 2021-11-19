package DataStructure;

public class Segregate_Even_and_Odd_Numbers {
public static void main(String[] args) {
	int arr[] = {12,3,14,16,9,7,31};
	int left =0, right = arr.length-1;
	
	while(left<right) {
		while(arr[left]%2 == 0 && left<right)
			left++;
		
		while(arr[right]%2 == 1 && left<right)
			right--;
		
		if(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
}
}
