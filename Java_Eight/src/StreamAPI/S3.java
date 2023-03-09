//filter method without using stream
package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class S3 {
	public static void main(String args[]) {
		List <String> emp=new ArrayList();
		emp.add("chirag");
		emp.add("chandan");
		
		emp.add("muni");
		emp.add("darshan");
		System.out.println(emp);
		//filtering with for loop
		for(int i=0;i<emp.size()-1;i++) {
			if(emp.get(i).startsWith("c")) {
				System.out.println(emp.get(i));
			}
		//to upper case	
		emp.forEach(x->System.out.println(x.toUpperCase()));
		}
	}
}
