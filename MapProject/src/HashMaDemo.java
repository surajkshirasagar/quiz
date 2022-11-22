import java.util.HashMap;
import java.util.HashSet;

public class HashMaDemo {
	
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		//HashSet<Integer>
		
		hm.put(10, "ashok");
		hm.put(20, "rahul");
		hm.put(10, "asha");
		hm.put(20, true);
		hm.put("abc", 20);
		hm.put(null, 40);
		hm.put(70, null);
		hm.put(70, "Rajesh");
		
		System.out.println(hm.get(70));//returns values for specified key
		
		System.out.println(hm);
		
		
	}

}
