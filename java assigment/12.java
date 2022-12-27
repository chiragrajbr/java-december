//print given 3 numbers in ascending  order
class ok{
	public static void main(String args[]){
		int a=40;
		int b=20;
		int c=20;
		if(a<=b&&a<=c){
			if(b<=c){
				System.out.println(a+" "+b+" "+c);
			}
			else if(c<=b){
				System.out.println(a+" "+c+" "+b);
			}
		}
		else if(b<=c&&b<=a){
			if(a<=c){
				System.out.println(b+" "+a+" "+c);
			}
			else if(c<=a){
				System.out.println(b+" "+c+" "+a);
			}
		}
		else if(c<=a&&c<=b){
			if(a<=b){
				System.out.println(c+" "+a+" "+c);
			}
			else if(b<=a){
				System.out.println(c+" "+b+" "+a);
			}
		}
    }
}