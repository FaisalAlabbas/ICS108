// Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.
// Ex: If the input is:

// n Monday
// the output is:

// 1 n
// Ex: If the input is:

// z Today is Monday
// the output is:

// 0 z's
// Ex: If the input is:

// n It's a sunny day
// the output is:

// 2 n's
// Case matters.

// Ex: If the input is:

// n Nobody
// the output is:

// 0 n's


import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a character followed by a string: ");
        String input = scanner.nextLine();

        // Split the input into the character and the string
        String[] parts = input.split(" ", 2);
        String character = parts[0];
        String string = parts.length > 1 ? parts[1] : "";

        // Count the occurrences of the character in the string
        int count = 0;
        for (char c : string.toCharArray()) {
            if (String.valueOf(c).equals(character)) {
                count++;
            }
        }

        // Prepare the output
        String output;
        if (count == 1) {
            output = count + " " + character;
        } else {
            output = count + " " + character + "'s";
        }

        // Print the output
        System.out.println(output);

        scanner.close();
    }
}
