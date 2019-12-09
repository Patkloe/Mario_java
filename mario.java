
public class mario {
    public int x;  // variable for the pyramid size
    mario(int val)  // class constructor
    {
    	 this.x = val;
    }
    public void pyramid(int x)  // function that buil pyramid, function of the class mario
    {
       if(x > 0 || x <= 8) { // start build pyramid
            for(int i = 0; i < x; i++) {      // for(int i = 0; i<n; i++)
               //Creates Spaces
               for(int j = x-1; j > i; j--) {// to build " "
                  System.out.print(" ");
               }
               //Creates Blocks
               for(int k = 0; k <= i; k++) {   //to build "#"
                  System.out.print("#");
               }
                  System.out.print("\n");
            }
         } // end build pyramid
    }
     public static void main(String[] args) {
      //Basic definitions
      int totalSteps = 0;
      if(args.length == 0 || args.length > 1 )
    {
       System.out.println("Usage : Java mario val");
       System.exit(1);
    }
    else
       {
        try {    // make sure the parameter is a numeric value
             totalSteps = Integer.parseInt(args[0]);

        } catch (Exception e) {
        System.out.println("Val should be a numeric value");
        System.exit(1);
       }
       //Verifies if the parameter values
         if(totalSteps < 0 || totalSteps > 8 ) {
            System.out.println("Val range [1 - 8]");
    	    System.exit(1);
         //Actual creation of step process
         } else if(totalSteps > 0 || totalSteps <= 8) {
            mario m = new mario(totalSteps);
       	    m.pyramid(totalSteps);
        }
      }
    }
}