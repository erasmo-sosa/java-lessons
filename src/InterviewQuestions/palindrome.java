package InterviewQuestions;

public class palindrome {

	public static void main(String[] args) {

		String inputString = "madaM";
		String reverseString = "";
		
		//reverse string
		for(int i = inputString.length() - 1 ; i >= 0 ;i-- ) {
			reverseString = reverseString + inputString.charAt(i);
			
		}
		// System.out.print(reverseString);
		
		if(inputString.equalsIgnoreCase(reverseString)) {
			System.out.print("the string is a palindrome !");
		}
	}

}
