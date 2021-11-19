package DataStructure;

import java.util.*;

public class Sorting_Arraylist_in_Descending_Order {
public static void main(String[] args) {
	int arr[] = {13,32,64,17,85};
	List<Integer> arrlist = new ArrayList<>();
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j] < arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		arrlist.add(arr[i]);
		System.out.print(arrlist.get(i) + " ");
	}
}
}
