// interface in static level
// no need to create object,we can access directly
package Interface;


interface test{
	static void m1() {
		System.out.println("static in method 1");
	}
	static void m2() {
		System.out.println("static in method 2");
	}
	
}

class test1 implements test{
	 static void m1() {
		System.out.println("using static method 1 in child level");
	}
	
}


public class I2 {
 public static void main(String args[]) {
	test.m1();
	test.m2();
	test1.m1();
	
 }
}
