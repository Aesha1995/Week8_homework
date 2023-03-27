package week8_homework;

import java.util.Scanner;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */
public class Programme8_Pattern {
    public static void main(String[] args) {
        Programme8_Pattern obj = new Programme8_Pattern(); //instance obj created
        obj.pattern(); //instance method calling
    }
    public void pattern() //instance method created
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.println("Enter Number : ");
        int a = scan.nextInt(); //Store value from user
        for(int i = 1;i<=a;i++)
        {
            for(int j = 1;j<=i;j++) {
                System.out.print("@"); //print the pattern
            }
            System.out.println();
        }
        scan.close();
    }

}
