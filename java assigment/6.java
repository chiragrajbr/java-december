//print gretest no in given no's
class ok{
	public static void main(String args[]){
		int [] arr={12,15,55,88,65};
		int maxnumber=arr[0];
		for (int i=0;i<arr.length;i++){
			if(arr[i]>maxnumber){
				maxnumber=arr[i];
			}
		}
		System.out.println("the highest number is "+maxnumber);
	}
}