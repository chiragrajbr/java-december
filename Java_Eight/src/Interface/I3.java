//interface in default variable
package Interface;

interface chirag{
	default void m1() {
		System.out.println("ok");
	}
	default void m2() {
		System.out.println("gm");
	}
}


class c1 implements chirag{
	public  void m1() {
		System.out.println("ok");
	}
}
public class I3 {

	public static void main(String[] args) {
	c1 a=new c1();
	a.m1();
	a.m2();
	}

}
