package Map;

import java.util.HashMap;
import java.util.Iterator;

public class M2 {

	public static void main(String[] args) {
	HashMap a=	new HashMap();
	a.put("banana", 25);
	a.put("apple", 100);
	a.put("mango", 60);
	a.put("grapes", 120);
    //  System.out.println(a.containsKey("banana"));  // to check contain or not
    //  a.clear(); // to clear all]
	Iterator b=a.entrySet().iterator();
	while(b.hasNext()) {
		System.out.println(b.next());
	}
   }
}
