package JavaCore;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		// EXAMPLE #1
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>(); 
		
		hashMap.put("a",10);
		hashMap.put("b",3);
		hashMap.put("c",22);
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("b"));
		
		// EXAMPLE #2
		// Login - User Password
		System.out.println("EXAMPLE #2");
		HashMap<String, String> hashMapLogin = new HashMap<String, String>();
		hashMapLogin.put("bob", "flipflop");
		hashMapLogin.put("ken", "dog123");
		hashMapLogin.put("tim", "cat455");
		System.out.println(hashMapLogin);
		hashMapLogin.remove("ken");
		System.out.println(hashMapLogin);
		System.out.println(hashMapLogin.containsKey("ken"));
		System.out.println(hashMapLogin.containsValue("dog123"));
		
		hashMapLogin.replace("bob", "boots788755");
		System.out.println(hashMapLogin);
		
		System.out.println();
		System.out.println("For HashMap Printing");
		for(Map.Entry<String, String> entry : hashMapLogin.entrySet()) {
			System.out.println(entry);
		}
		
	}

}
