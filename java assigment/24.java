//factors of 24 using while loop and its total sum
class ok{
	public static void main(String args []){
		int a=24;
		int sum=0;
		// int i=1;
		// while(i<=24){
			// if(a%i==0){
			// System.out.println(i);
			// }
				// i++;
		// }
		int i=1;
		while(i<=24){
			if(a%i==0){
			sum=sum+i;
			System.out.println(i);
			}
			i++;
		}
		System.out.println(" sum is "+sum);
	}
}