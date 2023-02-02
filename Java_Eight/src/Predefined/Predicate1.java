// predicate-use only when u want boolean results 
package Predefined;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		//Predicate<Integer> i=(a)->{return a>100;};
		Predicate<Integer> i=a-> a>=10;
		System.out.println(i.test(10));

	}

}
