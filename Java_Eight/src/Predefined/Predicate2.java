//bipredicate to pass two arguments
package Predefined;

import java.util.function.BiPredicate;

public class Predicate2 {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> i=(a,b)->{return (a+b>50);};
				System.out.println(i.test(1,1));
	}

}
