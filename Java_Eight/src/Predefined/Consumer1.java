//consumer it accepts only one argument but donot reply anything
package Predefined;

import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		Consumer <Integer> i=a->System.out.println("object created");
       i.accept(20);
       i.accept(20);
	}
}
