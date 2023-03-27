package week8_homework;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class Programme15_Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //Scanner created
        System.out.println("Enter number : ");
        int a = scan.nextInt(); //store value from user
        Programme15_Pattern3 obj = new Programme15_Pattern3(); //instance obj created
        obj.pattern(a); //instance method calling
        scan.close();
    }
    public void pattern(int a) //instance method created
    {
        //logic for print left angle triangle
        for(int i=1;i<=a;i++)
        {
            for(int k=1;k<=a-i;k++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*"); //print the pattern
            }
            System.out.println(" ");
        }
    }
}
