import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo4 {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("ashwini","joshi");
		map.put("ajay", "deshmukh");
		
		Set<Map.Entry<String, String>> entrySet=map.entrySet();
		Iterator<Map.Entry<String,String>> itr=entrySet.iterator();
		
		while(itr.hasNext()) {
			//Integer i = itr.next();
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key>>"+entry.getKey() +
			"  Value>>"+entry.getValue());
			
			if(entry.getKey().equals("ajay")) {
				entry.setValue("deshpande");
			
			}
			
		}
		
		System.out.println("map>>"+map);
	}

}
