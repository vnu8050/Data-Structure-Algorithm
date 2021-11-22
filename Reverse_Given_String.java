package DataStructure;
import java.util.*;

public class Reverse_Given_String {
	public static void main(String[] args) {
		String str = "Hi I am Arun Singh";
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		Stack<String> st = new Stack<>();
		for(String s : str.split(" ")) {
			if(!s.isEmpty()) {
				st.push(s);
			}
		}
			StringBuilder sb = new StringBuilder();
			while(!st.isEmpty()) {
				sb.append(st.pop());
				sb.append(" ");
			}
		return sb.toString();
	}
}
