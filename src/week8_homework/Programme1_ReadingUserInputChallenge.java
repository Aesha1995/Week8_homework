package week8_homework;

import java.util.Scanner;

/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge
 */
public class Programme1_ReadingUserInputChallenge {
    //main method declared
    public static void main(String[] args) {
        Programme1_ReadingUserInputChallenge obj = new Programme1_ReadingUserInputChallenge(); //instance method obj created
        obj.value(); //instance method calling
    }
    public void value() //instance method declared
    {
        Scanner scan = new Scanner(System.in); //scanner created
        int counter = 1;
        int sum = 0;
        while(counter<=10)
        {
            System.out.print("Enter number " + counter + " = ");
            boolean value = scan.hasNextInt(); //value store which enter by user
            //logic for find min and max number
            if(value)
            {
                int num = scan.nextInt();
                sum += num;
                counter++;
            }
            else //if enter invalid number print this statement
            {
                System.out.println("Invalid Number");
            }
            scan.nextLine();
        }
        System.out.println("sum of all numbers = " +sum);
        scan.close();
    }

}
