package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map;

public class lpl {

	public static void main(String[] args){
		//find the second most frequently repeated character of a given string. i.e succeessess
		
		String inputStr = "successess";
		// mostFrec;
		int maxFrequency = 0;
		int secMostFrequent = 0;
		//char [] arrMostFrecChars;
		List<Character> arrMostFrecChars = new ArrayList<>();
		//HashMap<Character, Integer> finder = new HashMap<Character, Integer>();
		Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
	
		//Get char counts
		for(int i = 0 ; i < inputStr.length(); i++) {

			Character currentChar =inputStr.charAt(i);
			if (!charCounter.containsKey(currentChar)) {
				charCounter.put(currentChar, 1);
			}
			else
			{
				int currentCount = charCounter.get(currentChar); 
				charCounter.put(currentChar, currentCount + 1);
			}
			
			}
		
		
		//Get the second most frequent
		//for(int k=0; k < charCounter.size(); k++) {	
		//}
		System.out.println(charCounter);
		
		for(int charFreq: charCounter.values()) {
			if (charFreq > maxFrequency) {
				
				secMostFrequent = maxFrequency;
				maxFrequency = charFreq;
				
			}
			else if(charFreq > secMostFrequent && charFreq != maxFrequency){
				secMostFrequent = charFreq;
			}
				
		}
		System.out.println(secMostFrequent);
		
		for(Map.Entry<Character, Integer> entry : charCounter.entrySet() ) {
			if (entry.getValue() == secMostFrequent) {
				arrMostFrecChars.add(entry.getKey());
			}
			
		}
		System.out.println(arrMostFrecChars);
	}
}
/*
The getOrDefault(Object key, V defaultValue) method of Map interface, 
implemented by HashMap class is used to get the value mapped with 
specified key. If no value is mapped with the provided key then the 
default value is returned.

		for(char c : inputStr)
*/

