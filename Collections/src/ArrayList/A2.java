// working on arraylist methods
package ArrayList;

import java.util.ArrayList;

public class A2 {
public static void main(String args[]) {
	ArrayList a=new ArrayList();
	a.add(01);
	a.add(02);// to add
	a.remove(1);//to remove
	//a.set(1, "1 index value is updated");//to update
    System.out.println(a);
    
    ArrayList b=new ArrayList();
    b.add("first");
    b.add("second"); 
    //System.out.println(b.get(1));//to get wt value is stored in tt index
    //System.out.println(b.size());//to find length
    //System.out.println(b.isEmpty());//to check object is empty or not
    //System.out.println(b.contains("second"));// to check it contains or not
    b.clear();//to clear
    System.out.println(b);
    
    Object c=a.clone();// to copy every elemets from a to c
    System.out.println(c);
   
    
   
}
}
