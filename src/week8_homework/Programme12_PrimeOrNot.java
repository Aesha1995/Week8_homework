package week8_homework;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme12_PrimeOrNot
{
    public static void main(String[] args) //main method declared
    {
        Scanner scan = new Scanner(System.in); //scanner imported
        System.out.print("Enter any Number : ");
        int n = scan.nextInt(); //store value which enter by user
        number(n);
        scan.close();
    }
    public static void number(int num)
    {
        boolean value = true;
        for (int i = 2; i < num; i++) //logic to check number is prime or not
        {
            if (num % i == 0)
            {
                value = false;
                break;
            }
        }
        if (value)
        {
            System.out.println("number " + num + " is prime"); //print if its prime number
        }
        else
        {
            System.out.println("number " + num + " is not prime"); //print if it is  not prime

        }
    }
}
