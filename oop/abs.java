//abstract-proccess of hideing certain details and showing some details
//cant create object
//starts with abstract key word
//we can extend abstract
//abstract can not have a body
abstract class parent{
	abstract void m1();
	abstract void m2();
}
		
 class child extends parent{
	void m1(){
		 System.out.println("m1 method");
	 }
	 void m2(){
		 System.out.println("m2 method");
	 }
	public static void main(String args[]){
	child a=new child();
	a.m1();
	a.m2();
	}
}