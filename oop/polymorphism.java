//polymorphism--var methods and object acts as differnt forms
class car{
	public void m1(){
		System.out.println("universal properties");
	}
}
class i20 extends car{
	public void m1(){
		System.out.println("top end 10 lakh");
	}
}
class swift extends i20{
	public void m1(){
		System.out.println("swift price 6 to 7 lakh");
	}
}
class text{
	public static void main(String args[]){
		car a=new car();
		a.m1();
		i20 b=new i20();
		b.m1();
		swift c=new swift();
		
		
		c.m1();
	}
}

