import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable<>();
		ht.put(10, "abc");
		ht.put("pqr", 20);
		ht.put(10, "abcde");
		//ht.put(null, 40);
		ht.put(60, null);
		
		System.out.println(ht);
	}
}
