//no divisible by 2,3 and 5
class ok{
	public static void main(String args[]){
		for (int i=1;i<=150;i++){
			if (i%2==0){
				if(i%3==0&&i%5==0){
					System.out.println(i);
				}
			}
			
		}
	}
}