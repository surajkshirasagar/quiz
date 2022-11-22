import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo3 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(10, "Ram");
		hm.put(20, "Shyam");
		hm.put(30, "Geeta");
		
		Set<Integer> set=hm.keySet();
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("Key");
			System.out.println(i);
			System.out.println("value");
			System.out.println(hm.get(i));
		}
		
	}

}
