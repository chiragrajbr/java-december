//to find duplicate element in array
class ok{
	public static void main(String args[]){
		int [] a={22,33,44,22,33,58,96,44};
		for (int i=0;i<a.length;i++){
			for (int j=i+1;j<a.length;j++){
				if( a[i]==a[j]&& i!=j){
					System.out.println(a[i]);
				}
			}
		}
	}
}