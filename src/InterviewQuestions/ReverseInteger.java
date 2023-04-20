package InterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {

		int input = 12345;
		String result = "";
		
		String str = Integer.toString(input);
		    
	    for(int i = str.length() - 1; i > - 1; i--){
	      result = result + str.charAt(i);
	    }
	    
	    input = Integer.parseInt(result);
	    
	    System.out.println(result);
	    System.out.println(input);

	}

}
