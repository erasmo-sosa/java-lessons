package HackerRank;

//https://www.hackerrank.com/challenges/java-negative-subarray/problem

public class JavaSubarray {

	public static void main(String[] args) {	
		
		int negativeArrCount = 0;
		
	    //int arrLenght = 5;
	    String spaceSepInt = "1 -2 4 -5 1";
	    String strArray[] = spaceSepInt.split(" ");
	    System.out.println("strArray.length: " + strArray.length);
	    
	    int intArray[] = new int[strArray.length];
	    
	    for(int i=0; i < intArray.length; i++) {
	    	intArray[i] = Integer.parseInt(strArray[i]);
	    }
	    
	    for(int i=0; i < intArray.length; i++) {
	    	for(int j=i; i < strArray.length; j++) {
	    		int current_sum = 0;
	    		for(int k=i; k < j; k++) {
	    			System.out.println("intArray[k]:" + intArray[k]);
	    			current_sum =+intArray[k];
	    			System.out.println("current_sum: " + current_sum);
	    		}
	    	}
	    }

	    
	    System.out.println(negativeArrCount);
	}

}
