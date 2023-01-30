//queue -  prior to processing the data
//allow duplicates 
//to not allow heterogeneous
package Queue;

import java.util.PriorityQueue;

public class Q1 {
public static void main(String args[]) {
	PriorityQueue a=new PriorityQueue();
	a.add("queue");
	System.out.println(a);
	a.poll();// to remove head of element
	System.out.println(a.poll());
	
	PriorityQueue b=new PriorityQueue();
	b.add(10);
	b.add(20);
	//System.out.println(b);
	//System.out.println(b.peek());// peek it shows first element
	b.clear(); // clear
	System.out.println(b);
	
	PriorityQueue d=new PriorityQueue();
	d.add(10);
	d.add(11);
	//System.out.println(d.size()); size
	//System.out.println(d.isEmpty());  isempty 
	//System.out.println(d.element());  it shows first element of head
	//d.remove(10); to remove particular element
	//d.offer(123);  to add elements
	System.out.println(d); 
	
	PriorityQueue e=new PriorityQueue();
	e.add("chirag");
	e.add("raj");
	//System.out.println(e.toArray()); converted to array
	//System.out.println(e.toString()); converted to string
	}
}
