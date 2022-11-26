package InterviewQuestions;
import java.util.HashMap;

public class CountRepeatedCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> charsCounter = new HashMap<Character, Integer>();
		char tmpSingleChar;
		int tmpCount;
		
		String input = "aabbaac";
		
		for(int i=0; i < input.length(); i++) { 
			
			tmpSingleChar = input.charAt(i);
			//System.out.print(tmpSingleChar);
			
			if ( ! charsCounter.containsKey(tmpSingleChar)) {
				charsCounter.put(tmpSingleChar, 1);
				//System.out.print(tmpSingleChar);
			}else {
				tmpCount = charsCounter.get(tmpSingleChar);
				tmpCount = tmpCount + 1;
				charsCounter.put(tmpSingleChar, tmpCount);
				//System.out.print(tmpCount);
			}
		
		}
		System.out.print(charsCounter);
	}

}