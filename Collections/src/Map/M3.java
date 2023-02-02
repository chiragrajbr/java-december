package Map;

import java.util.HashMap;

public class M3 {

	public static void main(String[] args) {
		HashMap a=new HashMap();
		a.put(1,"nayana");
		a.put(2,"thara");
		a.put(3,"leka");
		a.put(4,"meghana");
		System.out.println(a + " A objects");
		
		HashMap b=new HashMap();
		b.putAll(a);  // to copy every elements from a
		System.out.println(b + " B objects");
		}
}
