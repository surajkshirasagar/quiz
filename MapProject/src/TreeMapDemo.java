import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap tm = new TreeMap<>();
		tm.put(15, "Ajay");
		tm.put(5, "Ram");
		tm.put(20, "shyam");
		tm.put(1, "geeta");
		//tm.put(null, "abc");
		//tm.put("abcde", "abc");
		//tm.put(100, null);
		
		HashMap hm = new HashMap<>();
		hm.put(10, "xyz");
		hm.put(80, "pqr");
		
		SortedMap sortedMap = new TreeMap<>();
		sortedMap.put(60, "abc");
		sortedMap.put(30, "pqr");
		sortedMap.put(30, "pqrs");
		sortedMap.put(1000,"xyz");
		
		TreeMap tm2 = new TreeMap<>(hm);
		
		//System.out.println(tm2);
		
		tm.put(1, "seeta");
		
		//System.out.println(tm);
		
		TreeMap tm3 = new TreeMap<>(sortedMap);
		System.out.println(tm3);
	}

}
