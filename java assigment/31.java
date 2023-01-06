//check arrays are equal /same data type/same length
class ok{
	public static void main(String args[]){
		int [] a={1,2,5};
		int [] b={1,2,5};
		int n=a.length;
		int m=b.length;
		if(n==m){
			System.out.println("arrays are equal");
		}
		else{
			System.out.println("arrays are not  equal");
		}
	}
}