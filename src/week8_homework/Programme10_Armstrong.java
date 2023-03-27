package week8_homework;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme10_Armstrong
{
    public static void main(String[] args) //main method declare
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.print("Enter any Number : ");
        int n = scan.nextInt(); //store value enter by user
        Programme10_Armstrong obj = new Programme10_Armstrong(); //instance obj created
        obj.number(n); //instance method calling
        scan.close();
    }
    public void number(int number) //instance method created
    {
        int first = number;
        int last;
        int result = 0;
        while (first > 0) //logic for check no is armstrong or not ?
        {
            last = first % 10;
            result += Math.pow(last, 3);
            first /= 10;
        }
        if (result == number)
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
