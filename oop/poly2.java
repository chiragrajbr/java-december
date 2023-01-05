//polymorphism
class account{
	public void m1(){
		System.out.println("acc created successfully");
	}
}
class savings_account extends account{
	public void m1(){
		System.out.println("savings acc");
	}
}
class current_account extends account{
	public void m1(){
		System.out.println("current acc");
	}
}
class bank{
	public static void main(String args[]){
		account a=new account();
		savings_account b=new savings_account();
		current_account c=new current_account();
		b.m1();
		c.m1();
	}
}
