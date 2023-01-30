//extra methods in arraylist
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A3 {
public static void main(String args[]) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(12);
	//a.toString();// array to string
	//System.out.println(a.toArray());//arraylist to array
	Collections.replaceAll(a,10,"ok");//replacing
	System.out.println(a);
	
	ArrayList b=new ArrayList();
	b.add(10);
	b.add(12);
	ArrayList c=new ArrayList();
	c.add(10);
	c.add(30);
	b.retainAll(c);//finding common
	System.out.println(b);
	
	ArrayList d=new ArrayList();
	d.add("two");
	d.add("one");
	d.add("four");
	d.add("one");
    //Collections.sort(d);//sorting
    //Object e=d.subList(1, 2);// to create separate sublist array
	System.out.println(d.lastIndexOf("one"));
	System.out.println(d.indexOf("two"));
	
}
}

