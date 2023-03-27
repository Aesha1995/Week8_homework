package week8_homework;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class Programme6_Pattern1To10 {
    //main method
    public static void main(String[] args) {
        pattern(); //static method calling
    }
    public static void pattern() //static method declared
    {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in); //scanner declared
        System.out.println("Enter number of rows : ");
        int a = scan.nextInt(); //store value from user
        for(i=1;i<=a;i++)  //increment value of i
        {
            for(j=1;j<=i;j++) //increment value of j
            {
                System.out.print(j + " "); //print j
            }
            System.out.println();
        }
    }

}
