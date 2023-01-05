//setter and getter
class text1{
	private String name;
  public  void setname(String ename){
	  this.name=ename;
  }
   public String getname(){
	   return name;
   }
   private int id;
   public void setid(int eid){
	   this.id=eid;
   }
   public int getid(){
	   return id;
   }
   
}
class text extends text1{
	public static void main(String args[]){
	text1 a=new text1();
	a.setname("chirag");
	a.setid(101);
	System.out.println(a.getname());
	System.out.println(a.getid());
	}
}
