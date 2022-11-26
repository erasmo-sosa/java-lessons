package JavaCore;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Fruit Name: ");
		String fruitName = scan.nextLine();
		System.out.println("Fruit Name Entered is: " + fruitName);
		scan.close();
		
	}
}
