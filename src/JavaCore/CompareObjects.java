package JavaCore;

public class CompareObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "InterviewBit";
		String str2 = "InterviewBit";
		//(==) Operators don’t compare each character in this case. 
		// It compares the memory location.		 
		System.out.println(str1 == str2);
		
		String str3 = new String("InterviewBit");
		String str4 = "InterviewBit";
		 
		System.out.println(str3 == str4);
		
		System.out.println(str3.equals(str4));

	}

}
