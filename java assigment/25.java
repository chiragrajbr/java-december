//print reverse number
class ok{
	public static void main(String args[]){
		int a=126;
		int result=0;
		int reminder=0;
		while(a>0){
			reminder=a%10;
			result=result*10+reminder;
			a=a/10;
		}
		System.out.println(result);
	}
}