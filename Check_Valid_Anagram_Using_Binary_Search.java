package DataStructure;

public class Check_Valid_Anagram_Using_Binary_Search {
	public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int char_count[] =  new int[26];
        for(int i=0;i<s.length();i++){
            char_count[s.charAt(i) - 'a']++; 
               char_count[t.charAt(i) - 'a']--; 
        
        }
        for(int count : char_count){
            if(count != 0) return false;
        }
        return true; 
    }
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagrama";
		System.out.println(isAnagram(s,t));
	}
}
