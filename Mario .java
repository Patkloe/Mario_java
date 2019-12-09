public class Mario
{
    public int x;
    Mario(int val)
    {
    	 this.x = val;
    }
public void pyramid(int x)
{
       if(x > 0 || x <= 8) { // start build pyramid
            for(int i = 0; i < x; i++) {      // for(int i = 0; i<n; i++)
               //Creates Spaces
               for(int spaces = x-1; spaces > i; spaces--) {// to build " "
                  System.out.print(" ");
               }
               //Creates Blocks
               for(int dashes = 0; dashes <= i; dashes++) {   //to build "#"
                  System.out.print("#");
               }
                  System.out.print("\n");
            }
         } // end build pyramid
    }
      	public static void main(String[] args) {
    	 int val = 0;
	   if(args.length == 0 || args.length > 1 )
    {
       System.out.println("Usage : Java Mario val");
       System.exit(1);
    }
    else
       {
        try {
             val = Integer.parseInt(args[0]);
        } catch (Exception e) {
        System.out.println("Val should be a numeric value");
        System.exit(1);
       }
       if(val<= 0 || val > 8 ) {
            System.out.println("Val range [1 - 8]");
    	    System.exit(1);
          } else if(val > 0 || val <= 8) {
       	Mario m = new Mario(val);
       	m.pyramid(val);
       }
 }
}
}