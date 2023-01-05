//method overriding-using same parent method in child
class parent{
	public void m1(){
		System.out.println("method overriding m1");
	}
	public void m2(){
		System.out.println("method overriding m2");
	}
}
class child extends parent{
	
	public void m1(){
		System.out.println("method overriding m1 in child ");
	}
	public static void main(String args[]){
		parent a=new parent();
		a.m1();
		a.m2();
		child b=new child();
	    b.m1();
	}
	
}