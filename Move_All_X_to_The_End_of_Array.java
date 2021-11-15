package DataStructure;

public class Move_All_X_to_The_End_of_Array {
	static int count = 0;
		
		
	public static void main(String[] args) {
	String str = "abxcdx";
	int i = 0;
	String newstr = "";
	System.out.println(moveX(str , i, newstr));
}
static String moveX(String str,int index, String resstr) {
	if(index == str.length()) {
		while(count>0) {
			resstr += 'x';
			count--;
		}
		return resstr;
	}
	if(str.charAt(index) == 'x') {
		count++;
		return moveX(str, index+1, resstr);
	}else {
		resstr += str.charAt(index);
		return moveX(str, index+1, resstr); 
	}
}
}
