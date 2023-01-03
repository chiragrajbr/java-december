//public-variable level
//inside class outside main method
package p1;
public class a1{
	public static void main(String args[]){
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
		System.out.println(a1.e);
	}
	static int a=10;
	 public static int b=10;
	 private static int c=10;
	 final static int d=10;
	 volatile static int e=10;
}