//inheritance-reusing existing functionality and adding new features
//parent can hold child but child cant.
class parent{
	public static void m1(){
		System.out.println("parent class method 1");
	}
	public static void m2(){
		System.out.println("parent class method 2");
	}
	public static void m3(){
		int a=121;
		System.out.println(a);
	}
	public static void m4(){
		 String c="chirag";
		System.out.println(c);
	}
	static int e=133;
}


class child extends parent{
	public static void main(String args[]){
	parent a=new parent();
	a.m1();
	a.m2();
	a.m3();
	a.m4();
	System.out.println(e);
	
  }
}

//ex for child cant hold parent
/*class second_child extends parent{
	public static void main(String args[]){
		child b=new parent();
		b.m1();
	}
}
*/



