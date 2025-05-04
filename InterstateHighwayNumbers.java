// Primary U.S. interstate highways are numbered 1-99. Odd numbers (like the 5 or 95) go north/south, and evens (like the 10 or 90) go east/west. Auxiliary highways are numbered 100-999, and service the primary highway indicated by the rightmost two digits. Thus, I-405 services I-5, and I-290 services I-90. Note: 200 is not a valid auxiliary highway because 00 is not a valid primary highway number.

// Given a highway number, indicate whether it is a primary or auxiliary highway. If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway runs north/south or east/west.

// Ex: If the input is:
// 90
// the output is:
// I-90 is primary, going east/west.
// Ex: If the input is:
// 290
// the output is:
// I-290 is auxiliary, serving I-90, going east/west.

// Ex: If the input is:
// 0
// or any number not between 1 and 999, the output is:
// 0 is not a valid interstate highway number. 

// Ex: If the input is:
// 200
// the output is:
// 200 is not a valid interstate highway number. 

import java.util.Scanner; 

public class Branches23 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
   
      highwayNumber = scnr.nextInt();
      
      // Output whether the highway is auxiliary (serving which primary), or primary
      if ((highwayNumber < 1) || (highwayNumber > 999) || ((highwayNumber % 100) == 0)) { // Invalid
         System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
      else { // Valid
         if (highwayNumber > 99) {
            System.out.print("I-" + highwayNumber + " is auxiliary");
            // Get the primary
            primaryNumber = highwayNumber % 100; // Gets the rightmost 2 digits
            System.out.print(", serving I-" + primaryNumber);
         }
         else { // Must be 1-99
            primaryNumber = highwayNumber; 
            System.out.print("I-" + primaryNumber + " is primary");
         } 
      
         // Ready now to output the direction. 
         if ((primaryNumber % 2) == 0) { // Even
            System.out.println(", going east/west.");
         }
         else { // Odd
            System.out.println(", going north/south.");
         }
      }
   }
}
