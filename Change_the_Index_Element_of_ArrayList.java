package DataStructure;

import java.util.*;

public class Change_the_Index_Element_of_ArrayList {
public static void main(String[] args) {
	List<String> arrlist = new ArrayList<>();
	arrlist.add(0, "This");
	arrlist.add(1, "is");
	arrlist.add(2, "a");
	arrlist.add(3, "ArrayList");
	arrlist.add(4, "Sentence");

	System.out.println(arrlist);
	arrlist.set(3, "also");
	System.out.println(arrlist);


}
}
