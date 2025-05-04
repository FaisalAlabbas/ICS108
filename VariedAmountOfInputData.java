// Statistics are often calculated with varying amounts of input data. Write a program that takes any number of non-negative integers as input, and outputs the max and average. A negative integer ends the input and is not included in the statistics. Assume the input contains at least one non-negative integer.

// Output the average with two digits after the decimal point followed by a newline, which can be achieved as follows:
// System.out.printf("%.2f\n", average);

// Ex: When the input is:

// 15 20 0 3 -1
// the output is:

// 20 9.50



import java.util.Scanner; 

public class LabProgram { 
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int userInt;
      int sumInts;
      int numInts;
      int maxInt;
      double average;
         
      sumInts = 0;
      numInts = 0;
      maxInt  = -1;
      
      userInt = scnr.nextInt(); 
      
      while (userInt >= 0) {
         sumInts = sumInts + userInt;
         numInts = numInts + 1;
         
         if (userInt > maxInt) {
            maxInt = userInt;
         }
         userInt = scnr.nextInt();
      }
      
      average = (double)sumInts / numInts;
      
      System.out.print(maxInt + " ");
      System.out.printf("%.2f\n", average); 
   }
}
