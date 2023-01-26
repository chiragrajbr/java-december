package Set;

import java.util.HashSet;

public class Set1 {
public static void main (String args[]) {
	//do not allow duplicates
	//sort and shuffiling are not allowed
	//heterogeneous allowed
	//indexing concept not applicable
	HashSet a=new HashSet();
	//adding elements
	a.add(10);
	a.add(20);
	a.add(30);
	a.add("chirag");
	//System.out.println(a);
	

	//the no common in both will be printed- retainAll
	HashSet b=new HashSet();
	b.add(10);
	b.add(20);
	a.retainAll(b);
	//System.out.println(a);
	
	// addAll
	a.addAll(b);
	//System.out.println(a);
	
	a.removeAll(a);
	System.out.println(a);
	
}
}
