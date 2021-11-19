package DataStructure;

public class Remove_all_Duplicate_Char_From_String {
	static String newstr = "";
	public static String duplicate(String s,int index,boolean[] map,String newstr) {
		if(index == s.length()) {
			return newstr;
		}
		if(map[s.charAt(index)-'a']==false) {
			map[s.charAt(index)-'a']=true;
			newstr +=s.charAt(index);
			return (duplicate(s,index+1,map,newstr));
		}else
			map[s.charAt(index)-'a']=true;
			return duplicate(s,index+1,map,newstr);
	}
	public static void main(String[] args) {
		String s = "aabcdcb";
		int index = 0;
		boolean map[] = new boolean[26];
		System.out.println(duplicate(s,index,map,newstr));
	}
}
