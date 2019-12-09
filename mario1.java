import java.util.*;
import java.awt.*;
import java.lang.*;
public class mario1 {
     public static void main(String[] args) {
      //Basic definitions
      int totalSteps = 0;
      int blocks = 0;
      //For the while loop
      boolean continuation = true;
      //To get the user's input to create the total of Steps
      Scanner scan = new Scanner(System.in);    // should be parameter when you call file
      //Gathers the input
      System.out.print("Height: ");
      try {
             totalSteps = scan.nextInt();    // we check that parameter here
        } catch (Exception e) {    // make sure that the input value is numeric
        System.out.println("Val should be a numeric value [1 - 8]");
        System.exit(1);
       }
      //Starts the whole creation of steps
      while(continuation == true) {
         //Verifies if the value is outside of the proper condition, it'll ask again
         if(totalSteps < 1 || totalSteps > 8 ) {
            System.out.print("Height: ");
            try {
             totalSteps = scan.nextInt();
        } catch (Exception e) {
        System.out.println("Val should be a numeric value [1 - 8]");
        System.exit(1);
       }
         //Actual creation of step process
         } else if(totalSteps >= 1 || totalSteps <= 8) {
            for(int i = 0; i < totalSteps; i++) {      // for(int i = 0; i<n; i++)
               //Creates Spaces
               for(int j = totalSteps-1; j > i; j--) {// for(spaces = x-1; spaces>i; spaces--)  old   for(int j = totalSteps-1; j > blocks; j--)
                  System.out.print(" ");
               }
               //Creates Blocks
               for(int k = 0; k <= i; k++) {   //for(dashes = 0; dashes <= i; dashes++)     old  for(int k = -1; k < blocks; k++)
                  System.out.print("#");
               }
               blocks++;
               System.out.print("\n");
               //Ceases the loop if this condition becomes true
               if(blocks == totalSteps) {
                  continuation = false;
               }
            }
         }
      }
   }
}