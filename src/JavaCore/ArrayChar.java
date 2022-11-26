package JavaCore;

public class ArrayChar {

	public static void main(String[] args) {

		String inputStr = "newstring";
		char[] charArray;
		
		charArray = inputStr.toCharArray();
		
		for(char c : charArray) {
			System.out.println(c);
		}
	}

}
