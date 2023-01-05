//method overloading
//same method name but d/w in parameters
class text{
	int number;
	String name;
	
	public void m1(){
		System.out.println("method with zero argument");
	}
	public void m1(int a){
		this.number=a;
		System.out.println("method with 1 int argument");
		System.out.println(a);
	}
	public void m1(int a,int b){
		System.out.println("method with two int argument");
	}
	public void m1(String b){
		this.name=b;
		System.out.println("method with one string argument");
		System.out.println(b);
	}
	public void m1(String a,String b){
		System.out.println("method with two string argument");
	}
	public static void main(String args[]){
		text a=new text();
		a.m1();
		a.m1(10);
		a.m1(10,20);
		a.m1("chirag");
		a.m1("chirag","raj br");
	}
}



