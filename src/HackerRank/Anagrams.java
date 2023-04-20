package HackerRank;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if(a.length() != b.length()){
            return false;
        }
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        
        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);
        
		return java.util.Arrays.equals(arrA, arrB);    
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
 
	}

}
