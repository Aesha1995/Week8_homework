package week8_homework;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class Programme3_VowelAndConsonant {
    public static void main(String[] args)  //main method declared
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.print("Enter any Character : ");
        String alphabet = scan.next(); //store value which enter by user
        alpha(alphabet); //static method calling
        scan.close();
    }

    public static void alpha(String alphabet) //static method declared
    {
        alphabet = alphabet.toUpperCase(); //convert any alphabet to uppercase
        if(alphabet.length()==1 && Character.isAlphabetic(alphabet.charAt(0))) //check it have one character or more
        {
            //logic for vowels
            if (alphabet.equals("A") || alphabet.equals("E") || alphabet.equals("I") || alphabet.equals("O") || alphabet.equals("U"))
            {
                System.out.print("Vowel");
            }
            else
            {
                System.out.print("Consonant");
            }
        }
        else
        {
            System.out.println("error"); //error message
        }
    }
}
