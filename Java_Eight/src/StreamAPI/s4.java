//filtering numbers without using 
package StreamAPI;

import java.util.ArrayList;
import java.util.Optional;

public class s4 {
public static void main(String args[]) {
	ArrayList <Integer> number=new ArrayList();
	number.add(10);
	number.add(110);
	number.add(1120);
	number.add(20);
	number.add(30);
	//System.out.println(number);
//	for(int i=0;i<number.size()-1;i++) {
//		if(number.get(i)>15){
//			System.out.println(number.get(i));
//		}
//	}
	//min
	Optional<Integer> b=number.stream().min((x,y)->x.compareTo(y));
	System.out.println(b.get());
	//max
	Optional<Integer> c=number.stream().max((x,y)->x.compareTo(y));
	System.out.println(c.get());

}
}
