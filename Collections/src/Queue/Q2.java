//iterating queue by iterator and for each method
package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Q2 {
public static void main (String args[]) {
	PriorityQueue a=new PriorityQueue();
	a.add(10);
	a.add(20);
	a.add(30);
	/*Iterator b=a.iterator();
	while(b.hasNext()) {
		System.out.println(b.next());
		}*/
	
	//System.out.println(a.contains(10)); contains method
	
	for(Object no:a) {
		System.out.println(no);
	}
	}
	
}
