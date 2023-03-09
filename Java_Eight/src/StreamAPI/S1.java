//stream API - 1.8 onwards
//achieve - using  stream method
package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class S1 {
public static void main(String args[]) {
	 List <String>  a=new ArrayList();
			a.add("muni");
	 		a.add("chirag");
	 		a.add("darshu");
	 		a.add("manju");
	 		//System.out.println(a);	 
	 		a.stream().forEach((names)->{System.out.println(names);});
	 		a.stream().filter(x->x.startsWith("c")).forEach(y->System.out.println("the name starts with c is "+y));
	 	
}
}
