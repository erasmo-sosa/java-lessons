package InterviewQuestions;

// fact(n) = n * fact(n-1)

public class FactorialRecursive {

	public static void main(String[] args) {
		
		System.out.println(fact(0));
	}
	
	public static int fact(int n) {
		
		//Base Case
		if(n == 1 || n == 0) {
			return 1;
		}
		//Recursive Procedure
		else {
			return n * fact( n - 1 );
		}		
	}
}
