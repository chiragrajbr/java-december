//check array elements are same or not
import java.util.*;
class ok{
	public static void main(String args[]){
		int [] a={12,22,33};
		int [] b={12,22,33};
		Arrays.sort(a);
		Arrays.sort(b);
		
		chirag=Arrays.equals(a,b);
		System.out.println(chirag);
	}
}