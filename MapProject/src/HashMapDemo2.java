import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
		HashMap< Integer, String> hm = new HashMap<>();
		hm.put(101, "Bhavana"); //key=value = entry
		hm.put(102, "Rahul");
		hm.put(103, "Geeta");
		//hm.put("abc", 19);
		
		Set<Map.Entry<Integer, String>> entrySet=hm.entrySet();
		
		System.out.println("Entry Set");
		
		for(Object i : entrySet) {
			System.out.println(i);	
		}
		
		Set<Integer> keyset=hm.keySet();
		
		System.out.println("Key Set");
		for(Integer i : keyset) {
			System.out.println(i);//key
			System.out.println(hm.get(i));//returns values for specified key
		}
		
		Collection<String> values=hm.values();
		System.out.println("Values>>");
		for(String str : values) {
			System.out.println(str);
		}
		
	}

}
