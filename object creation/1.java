//object creation in java
//using instance and static
// rules--class name used as a object name
class ok{
	int a=10;
	static int b=20;
	public static void main(String args[]){
		ok a1=new ok();
		ok a2=new ok();
		
		System.out.println(a1.a);
		a2.b=25;
		System.out.println(a2.b);
	}
	
}