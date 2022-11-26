package JavaCore;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		// EXAMPLE #1
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("cat");
		hashSet.add("tiger");
		hashSet.add("lion");
		hashSet.add("cheeta");
		
		System.out.println(hashSet.size());
		System.out.println(hashSet);
		System.out.println(hashSet.contains("tiger"));
		System.out.println(hashSet.isEmpty());

		// EXAMPLE #2
		HashSet<Integer> hashSetInt = new HashSet<Integer>();
		hashSetInt.add(34);
		hashSetInt.add(22);
		hashSetInt.add(68);

		System.out.println(hashSetInt.toString());
		
		Iterator<Integer> it = hashSetInt.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
