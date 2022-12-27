//print even or odd for a given number
import java.util.*;
//it supports user input
class ok{
	public static void main(String args[]){
	Scanner	ab=new Scanner(System.in); 
	System.out.print("enter the number ");
	int result=ab.nextInt();
	//System.out.println("the no is "+result);
	if(result %2==0){
		System.out.println(result +" the number is even ");
	}
	else{
		System.out.println(result +" the number is odd ");
	}
	}
}