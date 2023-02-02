// method overload
class test{
	
	public void m1(String a){
		System.out.println("method with string value");
	}
	public void m1(int b){
		System.out.println("10,20,30,40");
	}
	public void m1(Boolean c){
		System.out.println("method with boolean value");
	}
	public void m1(double d){
		System.out.println("method with double value");
	}
	
	public static void main(String args[]){
		test a=new test();
		a.m1("chirag");
		a.m1(true);
		a.m1(95);
	}
}