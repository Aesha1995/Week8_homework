package week8_homework;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */
public class Programme14_Pattern2 {
    //main method declared
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.print("Enter number : ");
        int n = scan.nextInt(); //store value which enter by user
        diamond(n); //static method call
        scan.close();

    }
    public static void diamond(int n) //static method declare
    {
        int i = 1;
        int k,j;
        while(i<=n) //logic to print triangle pattern
        {
            k = 1;
            while(k<=n-i)
            {
                System.out.print(" ");
                k++;
            }
            j = 1;
            while(j<=2*i-1)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        //logic to print reverse replica of triangle
        i = n-1;
        while(i>0)
        {
            k = n;
            while(k>i)
            {
                System.out.print(" ");
                k--;
            }
            j = 1;
            while(j<=2*i-1)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
