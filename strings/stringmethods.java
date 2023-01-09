//string methods
class ok{
	public static void main(String args[]){
		StringBuffer a=new StringBuffer("prostack");
		String b=new String("prostack");
		String c=new String("  prostack academy  ");
		//a.append(" academy"); to concat string 
		//System.out.println(a.charAt(1)); to find charAt
		//System.out.println(a.length()); to find string length
		//System.out.println(a.compareTo(b)); comparing to values if to values are same o/p will be 0
	    //System.out.println(b.contains("p")); contians support only in string not in string buffer
		//System.out.println(a.indexOf("s")); it shows the index of charaacter
		//System.out.println(b.endsWith("k")); it checks wheather the character ends given or not,used in string 
		//System.out.println(a.isEmpty()); check wheather the string is empty or not
		//System.out.println(b.lastIndexOf("s")); lastIndexOf -it checks from last 
		//System.out.println(b.matches(c)); it checks wheather 2 strings match or not
		//System.out.println(b.replace("pro","big")); replace - it replace the given character
		//System.out.println(b.toCharArray()); toCharArray - converts the string to new character array
		//System.out.println(b.split("academy")); split - split into charAt array
		//System.out.println(b.startsWith("p"));starts - this method verifies the starting letter 
		//System.out.println(b.substring(0,3)); returns the new string which is the substring of specified string
		System.out.println(b.toLowerCase()); //converts string to lower case
		System.out.println(b.toUpperCase());//converts string to upper case
		System.out.println(c.trim());//trim used to remove white space in both side of string (empty space)
		System.out.println(b.valueOf("DCT ACADEMY"));//valueOf returns the string representation of specified value
	
		
	
	}
}
