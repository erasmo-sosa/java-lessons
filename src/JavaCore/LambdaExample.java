package JavaCore;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExample {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(5);
		arrList.add(8);
		
		// Example #1
		arrList.forEach((n) -> {System.out.println(n);});
		
		// Example #2
		Consumer<Integer> method = (n)-> {System.out.println(n);};
		arrList.forEach(method);
	}

}
