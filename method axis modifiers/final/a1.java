//final-method level
package p1;
public class a1{
	public static void main(String args[]){
		a1 a=new a1();
		a.m1();
	}
	final static void m1(){
		System.out.println("final in method level ");
	}
}