// functional interface has only one abstract method
// to achieve functional interface  achieve lambda
package Function;

interface hii{
	abstract void add(String a,String c);
}
public class Fun2 {

	public static void main(String[] args) {
		hii b=(String a,String c)->{
			System.out.println(a+c);
		};
		b.add("hello world"," windows");
	}
}


//lambda expression ()->{}; 
