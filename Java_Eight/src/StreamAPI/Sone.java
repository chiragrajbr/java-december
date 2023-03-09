//creating constructor in stwo file with private access modifier
package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Sone {
public static void main(String args[]) {
	List <Stwo> emp=new ArrayList();
	emp.add(new Stwo("chirag",01));
	emp.add(new Stwo("muni",02));
	emp.add(new Stwo("darshu",03));
	emp.forEach(x->System.out.println(x.getName()+" "+x.getId()));
	
	
}
}
