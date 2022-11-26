/*
https://www.geeksforgeeks.org
/check-whether-two-strings-are-anagram-of-each-other-using-hashmap-in-java/ 
 
 Anagram Words
 Listen		Silent
 Triangle	Integral
 */

package InterviewQuestions;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {

		String word_01 = "Listen";
		String word_02 = "Silent";
		
		// HashMap word_01_hash = 
		char w1[] = word_01.toLowerCase().toCharArray();
		char w2[]= word_02.toLowerCase().toCharArray();
		
		HashMap<Character,Integer> wh1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> wh2 = new HashMap<Character,Integer>();

		for(char c :  w1 ) {
			if(! wh1.containsKey(c)) {
				wh1.put(c, 1);
			}else {
				
				wh1.replace(c, wh1.get(c) + 1);
			}
		}
		
		for(char c :  w2 ) {
			if(! wh2.containsKey(c)) {
				wh2.put(c, 1);
			}else {
				
				wh2.replace(c, wh2.get(c) + 1);
			}
		}

		if(wh1.equals(wh2)) {
			System.out.println("Words are anagram");
		}
		System.out.println(wh1);
		System.out.println(wh2);
	}

}
