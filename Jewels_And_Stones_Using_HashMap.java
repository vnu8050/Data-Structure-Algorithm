package DataStructure;

import java.util.*;

public class Jewels_And_Stones_Using_HashMap {
	 public static int numJewelsInStones(String jewels, String stones) {
         int res = 0;
        Set setJ = new HashSet();
        for (char j: jewels.toCharArray()) setJ.add(j);
        for (char s: stones.toCharArray()) if (setJ.contains(s)) res++;
        return res; 
    }
	 public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbb";
		System.out.println(numJewelsInStones(jewels,stones));
	}
}
