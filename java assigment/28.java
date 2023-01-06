//anonymous array in java
//ntg but name less array
class ok {
    public static void main(String[] args)
    {
          // anonymous array
          sum(new int[]{ 1, 2, 3 });
    }
   
    public static void sum(int[] a)
    {
 
        // using for-each loop
        for (int i : a)
            
         
        System.out.println("The element is: " +i);
    }
}