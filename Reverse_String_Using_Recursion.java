package DataStructure;

public class Reverse_String_Using_Recursion {
public static void main(String[] args) {
	String str = "chirag";
	int n = str.length()-1;
	reverse_str(str, n);
}

	static void reverse_str(String str, int length) {
		if(str.length() <= 1 || str == null) {
			System.out.println(str);
		}else {
			if(length < 0) {
			return; 
			}
			System.out.print(str.charAt(length) + " ");
			length--;
			reverse_str(str, length--);
		}
		
	}
}
