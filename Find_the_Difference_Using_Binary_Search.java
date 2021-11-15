package DataStructure;

import java.util.HashMap;

public class Find_the_Difference_Using_Binary_Search {
	 public static char findTheDifference(String s, String t) {
	        
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        for(char c: s.toCharArray()){
	            map.put(c, map.getOrDefault(c, 0) +1);
	        }
	        
	        for(char c: t.toCharArray()){
	            if(map.containsKey(c) && map.get(c) == 0 || !map.containsKey(c)){
	            return c;
	            }else{
	            map.put(c, map.get(c)-1);
	        }}
	    return '!';
	    }
	 public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "abcde";
		System.out.println(findTheDifference(s1, s2));
	}
}
