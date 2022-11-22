import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap();
		map.put(10, "Ajay");
		map.put(20, "Asha");
		map.put(30, "Madhav");
		map.put(40, "Rahul");
		
		System.out.println(map);
		
	}

}
