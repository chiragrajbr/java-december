//java pgm to print first 5 values which are divisible by 2,3 and 5
class ok{
	public static void main(String args[]){
		System.out.println("no divisible by 2 are");
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		System.out.println("no divisible by 3 are");
		for(int i=1;i<=15;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
		System.out.println("no divisible by 5 are");
		for(int i=1;i<=25;i++){
			if(i%5==0){
				System.out.println(i);
			}
		}
				
	}
}