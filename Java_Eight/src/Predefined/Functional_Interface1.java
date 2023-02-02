//simplifying lambda while using 2 arguments
package Predefined;

interface add{
	String m1(String a,String b);
}
public class Functional_Interface1 {

	public static void main(String[] args) {
	add i=(a,b)->a+b;
	System.out.println(i.m1("hi", " good morning"));

	}

}
