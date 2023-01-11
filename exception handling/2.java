//exception in finally
class ok{
	public static void main(String args[]){
		//System.out.println(0/0);
		int[] c={1,2,3,4};
		try{
		//System.out.println(0/0);
		System.out.println(c[4]);
		}
		/*catch(ArithmeticException a){
			System.out.println("index error due to ArithmeticException");
		}*/
		catch(Exception a){
			System.out.println("index error due to Exception");
		} 
		finally{
			System.out.println("Error due to mistakes");
		}
		
		
	}
	
}