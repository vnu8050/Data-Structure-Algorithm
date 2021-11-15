package DataStructure;

import java.util.*;

public class Copy_all_Elements_From_One_ArrayList_to_Another {
public static void main(String[] args) {
	List<String> arrlist = new ArrayList<>();
	List<String> duplicate = new ArrayList<>();
	arrlist.add(0, "This");
	arrlist.add(1, "is");
	arrlist.add(2, "a");
	arrlist.add(3, "Sentence");
	arrlist.add(4, "arraylist");
	
	for(int i=0;i<arrlist.size();i++) {
		duplicate.add(arrlist.get(i));
	}
	for(int i=0;i<duplicate.size();i++) {
		System.out.print(duplicate.get(i) + " ");
	}
	
}
}
