package HackerRank;

//https://www.hackerrank.com/challenges/java-negative-subarray/problem

public class JavaSubarray {

	public static void main(String[] args) {	
		
		int negativeArrCount = 0;
		
	    int arrLenght = 5 -1;
	    String spaceSepInt = "1 -2 4 -5 1";
	    String strArray[] = spaceSepInt.split(" ");
	    int intArray[] = new int[arrLenght];
	    
	    for(int i=0; i < arrLenght; i++) {
	    	intArray[i] = Integer.parseInt(strArray[i]);
	    }
	    
	    for(int i=0; i < arrLenght; i++) {
	    	for(int j=i; i < arrLenght; j++) {
	    		int current_sum = 0;
	    		for(int k=i; k < j; k++) {
	    			System.out.println("intArray[k]:" + intArray[k]);
	    			current_sum =+intArray[k];
	    			System.out.println("current_sum" + current_sum);
	    		}
	    	}
	    }

	    
	    System.out.println(negativeArrCount);
	}

}
