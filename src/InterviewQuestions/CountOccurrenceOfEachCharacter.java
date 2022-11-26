/*
 * https://www.geeksforgeeks.org/
 * java-program-to-count-the-occurrence-of-each-character-in-a-string-using-hashmap/
Input: str = "GeeksForGeeks"
Output:
r 1
s 2
e 4
F 1
G 2
k 2
o 1
*/
package InterviewQuestions;

import java.util.HashMap;

public class CountOccurrenceOfEachCharacter {

	public static void main(String[] args) {

		String inputStr = "GeeksForGeeks";
		Character currentChar = '0';
		int currentCount = 0;
		
		HashMap<Character,Integer> ocurrence = new HashMap<Character,Integer>();
		
		for(int i = 0; i < inputStr.length(); i++) {
			
			currentChar = inputStr.charAt(i);
			if (! ocurrence.containsKey(currentChar)){
				
				ocurrence.put(currentChar, 1);
		
			}else {
				currentCount = ocurrence.get(currentChar);
				currentCount = currentCount + 1;
				ocurrence.replace(currentChar, currentCount);
			}			
			
		}
		System.out.println(ocurrence);
	}

}
