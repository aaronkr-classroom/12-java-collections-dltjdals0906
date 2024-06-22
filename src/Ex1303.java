import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map.Entry;

public class Ex1303 {

	public static void main(String[] args) {
		HashMap<Integer, String> str = new HashMap<Integer, String>();
		
		str.put(1, "A");
		str.put(3, "B");
		str.put(10, "C");
		str.put(500, "D");
		System.out.println(str);
		
		// 키
		System.out.print("Keys : ");
		/* for (Intger key : str.keySet()) {
			
		}
		
		// 값
		System.out.print("\nvalues : ");
		for (String value : str.values()) {
			System.out.print(value + ", ");
		}*/
		
		// TreeMap
		TreeMap<String, String> animals = new TreeMap<String, String>();
		
		
		animals.put("cat", "페르시안");
		animals.put("dog", "테리어");
		animals.put("fish", "고등어");
		animals.put("zoo", "기린");
		
		System.out.println(animals);
		
		animals.remove("dog");
		System.out.println(animals);
		
		System.out.println(animals.size());
		System.out.println(animals.get("zoo"));
		
		System.out.print("(Key, Value) = ");
		Iterator<String> keys = animals.keySet().iterator();
		
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.print("(" + key + ", " + animals.get(key) + " )");
		}
	}

}
