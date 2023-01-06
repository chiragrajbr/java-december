//armstrong no-cube of whole number is equal to same number 
//ex 125=(125)*
//OR 125 =(1)*(2)*(5)*
class ok{
	public static void main(String args[]){
		int a=125;
		int b=a;
		int result=0;
		int reminder=0;
		while(a>0){
		reminder =a%10;
		result=reminder*reminder*reminder+result;
		a=a/10;
		//System.out.println(reminder);
		//System.out.println(result);
		//System.out.println(a);
		}
		//System.out.println(a);
		//System.out.println(result);
		if(b==result){
			System.out.println(b+" it is a amstrong number");
		}
		else{
			System.out.println(b+" it is not a amstrong number");
		}
	}
}
