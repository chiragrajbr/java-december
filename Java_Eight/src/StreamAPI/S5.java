//stream API
//creating constructor in s6 file with public access modifier
package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class S5 {
public static void main(String args[]) {
	List <S6> employees=new ArrayList();
	employees.add(new S6("chirag",01,15000));
	employees.add(new S6("muni",02,15000));
	employees.add(new S6("darshu",03,15000));
	//System.out.println(employees);
	//iterating S6 files using for loop
	//for(int i=0;i<employees.size();i++) {
	//	System.out.println(employees.get(i).name+" "+employees.get(i).id+" "+employees.get(i).salary);
	//}
	
	//for each
	employees.forEach(x->System.out.println(x.name+" "+x.id+" "+x.salary));
}
}

