// normal function using lambda
//implementation using lambda - consizing the code
package Predefined;

interface fun{
	 abstract int multiple1(int a);
}

public class Functional_Interface {

	public static void main(String[] args) {
	//fun	i=(int a)->{return a*a;};
	//fun i=(a)->{ return a*a;};
	//fun i=(a)->a*a;
	fun	i= a->a*a;
	System.out.println(i.multiple1(10));
		}
     }


