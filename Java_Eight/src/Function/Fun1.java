//functional interface - contains only one abstract method
// while calling @FunctionalInterface it only allows one abstract method
package Function;
@FunctionalInterface
interface function{
	abstract void add(int a,int b);
}


public class Fun1 {

	public static void main(String[] args) {
		function i=(int a,int b)->{
			System.out.println(a+b);
		};
		i.add(20, 20);

	}

}
