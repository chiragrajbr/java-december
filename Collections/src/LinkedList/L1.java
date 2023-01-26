package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

//allow duplicates ,allow heterogeneous elements
// works on node/indexing concept 
public class L1 {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add(20);
		a.add(30);
		a.add(40);
		a.addFirst(10);
		a.add("prostack academy");
		a.add("full stack developer");
		a.addLast("ok");
		//a.remove(2);
		//Collections.reverse(a);
		System.out.println(a);
		/*Iterator b=a.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}*/

	}

}
