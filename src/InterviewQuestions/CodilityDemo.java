/*
 This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, 
returns the smallest positive integer 
(greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

Copyright 2009–2023 by Codility Limited. All Rights Reserved. 
Unauthorized copying, publication or disclosure prohibited.
*/

package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class CodilityDemo {

	public static void main(String[] args) {

		int smallPositive = 0;
		int nextPositive = 0;
		
		//Input Examples
		int[] intArray = new int[] {1, 3, 6, 4, 1, 2};
		//int[] intArray = new int[] {1, 2, 3};
		//int[] intArray = new int[] {-1, -3};
		
		ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
		
		//unique elements
		for (int i=0; i < intArray.length; i++) {
			
			
			if(! uniqueElements.contains(intArray[i])) {
			
				uniqueElements.add(intArray[i]);
			}
		}
		
		
		//sort ArrayList
		Collections.sort(uniqueElements);
		
		System.out.println(uniqueElements);
		
		//smallest positive integer
		for(int i = 0; i < uniqueElements.size() - 1 ; i++) {
			
			nextPositive = uniqueElements.get(i + 1);
			
			if( uniqueElements.get(i) + 1 < nextPositive) {
				smallPositive = uniqueElements.get(i) + 1;
				break;
			}
			//if at the end of array smallest is out of range
			if(i + 1 == uniqueElements.size() - 1) {
				smallPositive = uniqueElements.get(i) + 2;
			}
			
		}
		
		
		if(smallPositive <= 0) {
			smallPositive = 1;
		}
		
		System.out.println(smallPositive);
		
	}

}
