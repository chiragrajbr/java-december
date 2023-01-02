//fibonacci series of 17
//sum of 1st two values
class ok{
	public static void main(String args []){
		int a=10;
		int a1=0;
		int a2=1;
		int i=1;
		System.out.println(a1);
		System.out.println(a2);
		while(i<=a-2){
			int sum=a1+a2;
			a1=a2;
			a2=sum;
			System.out.println(sum);
			i++;
		}
		
	}
}