// map - map is a object that maps keys and values
package Map;

import java.util.HashMap;

public class M1 {

	public static void main(String[] args) {
		HashMap a=new HashMap();
		a.put(01, "Prostack");
		a.put(02, "DCT");
		a.put(03, "Q spider");
	//	System.out.println(a +" display objects");  
	//	System.out.println(a.size()+" size of object"); //size 
	//  System.out.println(a.values());// only values
	//	System.out.println(a.keySet()); // only keys
	//	System.out.println(a.entrySet()); // to take both key and values
	//	a.remove(01); // to remove
	
		for(Object emp:a.entrySet()) {
			System.out.println(emp);// iterating object
		}
	}

}
