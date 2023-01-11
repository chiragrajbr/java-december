//exception handling 
//using try catch
class ok{
	public static void main(String args[]){
		System.out.println("Exception Handling");
		try{
		System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println("10 cant be divided by zero");
		}
	} 
}
