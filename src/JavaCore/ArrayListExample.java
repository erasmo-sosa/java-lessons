package JavaCore;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		// Array
		String[] fruitsArr = new String[4];
		fruitsArr[0] = "mango";
		fruitsArr[1] = "apple";
		fruitsArr[2] = "strawberry";
		fruitsArr[3] = "watermelon";
		System.out.println(fruitsArr);
		
		// Array List
		ArrayList<String> fruitsArrList = new ArrayList<String>();
		fruitsArrList.add("mango");
		fruitsArrList.add("apple");
		fruitsArrList.add("strawberry");
		fruitsArrList.add("watermelon");
		System.out.println(fruitsArrList);
		
		fruitsArrList.remove("apple");
		System.out.println(fruitsArrList);
		System.out.println(fruitsArrList.contains("apple"));
		
		for (int i = 0; i < fruitsArrList.size(); i++)    
            // Printing and display the elements in ArrayList
            System.out.print(fruitsArrList.get(i) + " ");
		
	}

}
