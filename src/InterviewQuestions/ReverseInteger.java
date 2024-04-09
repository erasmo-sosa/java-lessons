package InterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {

		int input = 12345;
		int output = 0;
		String result = "";
		System.out.println("Input Integer: " + input);
		
		String str = Integer.toString(input);
		    
	    for(int i = str.length() - 1; i > - 1; i--){
	      result = result + str.charAt(i);
	    }
	    
	    output = Integer.parseInt(result);
	    
	    //System.out.println(result);
	    System.out.println("Output Integer: " + output);

	}

}
