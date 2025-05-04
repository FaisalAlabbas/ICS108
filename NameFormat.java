// Name format
// Many documents use a specific format for a person's name. Write a program whose input is:

// firstName middleName lastName

// and whose output is:

// lastName, firstInitial.middleInitial.

// Ex: If the input is:

// Pat Silly Doe
// the output is:

// Doe, P.S.
// If the input has the form:

// firstName lastName

// the output is:

// lastName, firstInitial.

// Ex: If the input is:

// Julia Clark
// the output is:

// Clark, J.

import java.util.Scanner; 

public class LabProgram { 
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in); 
      String userInput;
      String firstName;
      String firstInitial;
      String middleInitial;
      String lastName;
      int spaceIndex1;
      int spaceIndex2;
      
      userInput = scnr.nextLine(); 
      spaceIndex1 = userInput.indexOf(' ');
      spaceIndex2 = userInput.indexOf(' ', spaceIndex1 + 1);
      
      firstName = userInput.substring(0, spaceIndex1);
      firstInitial = userInput.substring(0, 1);
      if (spaceIndex2 != -1) {
         middleInitial = userInput.substring(spaceIndex1 + 1, spaceIndex1 + 2);
         lastName = userInput.substring(spaceIndex2 + 1, userInput.length());
      }
      else {
         middleInitial = "";
         lastName = userInput.substring(spaceIndex1+1, userInput.length());
      }
      
      if (middleInitial != "") {
         System.out.println(lastName + ", " + firstInitial + "." + middleInitial + ".");
      }
      else {
         System.out.println(lastName + ", " + firstInitial + ".");
      }
   
   }
}
