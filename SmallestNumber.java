
//Write a program whose inputs are three integers, and whose output is the smallest of the three values.
//
//Ex: If the input is:
//
//7 15 3
//the output is:
//
//3

import java.util.Scanner;

public class Branches22 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input the numbers");
        int num1;
        int num2;
        int num3;
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();

        if ((num1 <= num2) && (num1 <= num3)) {    // num1 is smaller than both num2 and num3, so is smallest
            System.out.println(num1);
        }
        else if ((num2 <= num1) && (num2 <= num3)) { // num2 is smaller than both num1 and num3, so is smallest
            System.out.println(num2);
        }
        else { // Neither num1 nor num2 are smallest, so num3 must be smallest
            System.out.println(num3);
        }
    }
}
