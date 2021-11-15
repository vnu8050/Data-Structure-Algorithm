package DataStructure;

public class First_and_Last_Occurance_of_Char_In_String {
	static 	int first = -1, last = -1;

public static void main(String[] args) {
	String str = "bcdaesdjafggaf";
	int index = 0;
	occurance(str, index);
}
static void occurance(String str, int i) {
	if(i == str.length()) {
		System.out.println(first + " "+ last);
		return;
	}
	if(str.charAt(i) == 'e') {
		if(first == -1) {
			first = i;
		}else {
			last = i;
		}
		}
	occurance(str, i+1);
	
}
}
