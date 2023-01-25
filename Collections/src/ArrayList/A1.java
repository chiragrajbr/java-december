package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class A1{
public static void main(String args[]) {
	// addAll method
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	System.out.println(a);
	
	//now adding elements to b variable
	ArrayList b=new ArrayList();
	b.addAll(a);
	System.out.println(b);
	
	//sort 
	ArrayList c=new ArrayList();
	c.add("chirag");
	c.add("muni");
	c.add("darshu");
	System.out.println(c);
	Collections.sort(c);
	System.out.println(c);
	
	//decending or reverse order
	Collections.reverse(a);
	System.out.println(a);
	
	//clear
	c.clear();
	System.out.println(c);
	
	
}
}
