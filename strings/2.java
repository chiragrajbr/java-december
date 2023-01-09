//string objects are immutable
class ok{
	public static void main(String args[]){
		String a=new String("chirag ");
		String b=a.concat("raj br");
		System.out.println(b);
	}
}