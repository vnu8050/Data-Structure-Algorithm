package DataStructure;

import java.util.*;

public class Number_Of_Recent_Calls {
	 List<Integer> list;
	    
	    public Number_Of_Recent_Calls() {
	        list = new ArrayList<>();
	    }
	    
	    public int ping(int t) {
	        list.add(t);
	        int index = Collections.binarySearch(list, t - 3000); 
	        if (index < 0) { 
	            index = ~index; 
	        }
	        return list.size() - index;
	    }
	    public static void main(String[] args) {
	    	int index = -10;
			System.out.println(~index);
		}
}
