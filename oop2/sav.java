//savings acc
package pack1;
public class sav extends acc{
	public void get_bal(){
		System.out.println(getid()+" your min balance is"+getmin_bal());
		
	}
	
	private double min_bal;
	public void setmin_bal(double min_bal){
	this.min_bal=min_bal;
}
    private double  getmin_bal(){
		return min_bal;
	}
}