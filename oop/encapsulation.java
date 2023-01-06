//encapsulation-binding data and method in single reusable code

class ok{
    private	String name;
	public void setname(String ename){
		this.name=ename;
		
	}
	public String getname(){
		return "my name is "+ name;
		
	}
	
	private	int  id;
	public void setid(int eid){
		this.id=eid;
		
	}
	public int getid(){
		return id;
		
	}

}
class test extends ok{
	public static void main(String args[]){
		test a=new test();
		a.setname("chirag");
		a.setid(123);
		System.out.println(a.getname());
		System.out.println("my id is "+a.getid());
	}
}