//static -method level
package p1;
public class a1{
	public static void main(String args[]){
		a1 a=new a1();
		a.m1();
	}
	static void m1(){
		System.out.println("static level");
	}
}