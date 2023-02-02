// using boolean in interface
package Predefined;
interface boo{
	 boolean m1(int a);
}


public class Boolean1 {

	public static void main(String[] args) {
	//boo i= (int a)->{return a<100;};
	boo i=a->a>100;//implements using lambda expression
	System.out.println(i.m1(10));
	}

}
