//predicate in string
package Predefined;

import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String[] args) {
		Predicate<String> i=a->a=="ok";
		System.out.println(i.test("ok"));

	}

}
