package InterviewQuestions;

import java.io.CharArrayReader;
import java.util.HashMap;
import java.util.Map;

public class SubstringWithLongestNonReapeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find the substring with longest string with no repeating characters
		
		//examples
		//1.
		// abcabcbb
		//abc (3)
		//2.
		//fgghigji
		//higj
		//4
		
		//return
		int count=0;
		int maxCount=0;
		String str = "abcabcbb";
		//String str = "fgghigji";
		char charArray[] = str.toCharArray();
		//HashMap<Character,Integer> countMap = new HashMap<Character, Integer>();
		
		for(int i=0; i < charArray.length; i++) {
			HashMap<Character,Integer> countMap = new HashMap<Character, Integer>();
			count=0;
			for(int k = i; k < charArray.length;k++) {
				
				if(! countMap.containsKey(charArray[k]) ) {
					countMap.put(charArray[k], 1);
					
					count = count + 1;
					if(count > maxCount) {
						maxCount = count;
					}
				}else {
					break;
				}
				
			}
		}
		System.out.println(maxCount);
	}
	

}
