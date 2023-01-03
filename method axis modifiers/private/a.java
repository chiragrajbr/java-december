//private -method level
package p1;
public class a{
	public static void main(String args[]){
		a x=new a();
		x.m1();
	}
	private static void m1(){
		System.out.println("private modifier in method level");
	}
}