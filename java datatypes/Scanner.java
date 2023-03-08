//scanner
import java.util.Scanner;
class ok{
	public static void main(String args[]){
		Scanner a=new Scanner(System.in);
		System.out.println("ENTER THE NO");
		int result=a.nextInt();
		if(result %2==0){
			System.out.println("is odd");
		}
		else {
			System.out.println("is even");
		}
	}
}