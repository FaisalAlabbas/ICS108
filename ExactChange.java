// Write a program with total change amount in pennies as an integer input, and output the change using the fewest coins, one coin type per line. The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.

// Ex: If the input is:

// 0
// the output is:

// No change
// Ex: If the input is:

// 45
// the output is:

// 1 Quarter
// 2 Dimes 

import java.util.Scanner; 

public class LabProgram { 
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in); 
      int inputVal;
      int numDollars;
      int numQuarters;
      int numDimes;
      int numNickels;
      int numPennies;
   
      inputVal = scnr.nextInt(); 
   
      if (inputVal <= 0) {
         System.out.println("No change"); 
      } // Could return at this point
   
      numDollars = inputVal / 100;
      inputVal = inputVal - (numDollars * 100);
      
      numQuarters = inputVal / 25;
      inputVal = inputVal - (numQuarters * 25);
      
      numDimes = inputVal / 10;
      inputVal = inputVal - (numDimes * 10);
      
      numNickels = inputVal / 5;
      inputVal = inputVal - (numNickels * 5);
      
      numPennies = inputVal;
      
      if (numDollars > 0) {
         System.out.print(numDollars);
         if (numDollars == 1) {
            System.out.println(" Dollar");
         }
         else {
            System.out.println(" Dollars");
         }
      }
      
      if (numQuarters > 0) {
         System.out.print(numQuarters); 
         if (numQuarters == 1) {
            System.out.println(" Quarter"); 
         }
         else {
            System.out.println(" Quarters");
         }
      }
   
      if (numDimes > 0) {
         System.out.print(numDimes);
         if (numDimes == 1) {
            System.out.println(" Dime");
         }
         else {
            System.out.println(" Dimes");
         }
      }
      
      if (numNickels > 0) {
         System.out.print(numNickels);
         if (numNickels == 1) {
            System.out.println(" Nickel");
         }
         else {
            System.out.println(" Nickels");
         }
      }
      
      if (numPennies > 0) {
         System.out.print(numPennies);
         if (numPennies == 1) {
            System.out.println(" Penny");
         }
         else {
            System.out.println(" Pennies");
         }
      }
      
   }
}
