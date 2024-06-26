package HackerRank;

//https://www.hackerrank.com/challenges/java-negative-subarray/problem
//https://utkarsh1504.github.io/DSA-Java/subarrays
//https://utkarsh1504.github.io/DSA-Java/subarrays

public class JavaSubarray {

	public static void main(String[] args) {	
				
	    int arrLenght = 5;
	    String spaceSepInt = "1 -2 4 -5 1";
	    String strArray[] = spaceSepInt.split(" ");
	    
	    int intArray[] = new int[arrLenght];
	    
	    //Create Int Array
	    for(int i=0; i < arrLenght; i++) {
	    	intArray[i] = Integer.parseInt(strArray[i]);
	    	//System.out.println(intArray[i]);
	    }
	    
	    int negative_subarrays = 0;
	    
	    //Calculate negative subarrays
	    for(int i=0; i < arrLenght; i++) {
	    	for(int j=i; j < arrLenght; j++) {
	    		int current_sum = 0;
	    		// Print subarray between current starting
                // and ending points
	    		for(int k=i; k <= j; k++) {
	    			//System.out.println(intArray[k]);
	    			current_sum +=intArray[k];
	    		}
	    		if(current_sum < 0) {
	    			negative_subarrays++;
	    		}
	    	}
	    }
	    

	    
	    System.out.println(negative_subarrays);
	}

}

//HackerRank Solution
/*
 
public class Solution {

    public static void main(String[] args) {
        //Enter your code here. Read input from STDIN. 
         //Print output to STDOUT. Your class should be named Solution.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int negative_subarrays = 0;
        
        for(int i=0; i < n; i++){
            for(int k=0; k < n; k++){
                int current_sum = 0;
                for(int m = i; m <= k; m++){
                    current_sum += arr[m];  
                }
                if(current_sum < 0){
                    negative_subarrays++;
                }
            }
        }
        System.out.println(negative_subarrays);

    }
}

 
*/
//Recursive Solution
/*
    class solution
    {
        // Recursive function to print all possible subarrays
        // for given array
        static void printSubArrays(int []arr, int start, int end)
        {    
            // Stop if we have reached the end of the array    
            if (end == arr.length)
                return;
             
            // Increment the end point and start from 0
            else if (start > end)
                printSubArrays(arr, 0, end + 1);
                 
            // Print the subarray and increment the starting point
            else
            {
                System.out.print("[");
                
                for (int i = start; i < end; i++){
                    System.out.print(arr[i]+", ");
                }
                 
                System.out.println(arr[end]+"]");
                printSubArrays(arr, start + 1, end);
            }
             
            return;
        }
         
        public static void main(String args[])
        {
            int []arr = {1, 2, 3};
            printSubArrays(arr, 0, 0);
        }
    }
 */
