//to print least number
class ok{
	public static void main(String args[]){
		int [] arr={18,15,55,88,65};
		int minnumber=arr[0];
		for (int i=0;i<arr.length;i++){
			if(arr[i]<minnumber){
				minnumber=arr[i];
			}
		}
		System.out.println("the least number is "+minnumber);
	}
}