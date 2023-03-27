package week8_homework;

/**
 * 11. Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */
public class Programme11_EvenDigitSum {
    public static void main(String[] args) //main method declared
    {
        //print output
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) //instance method declared with one parameter
    {
        int result = 0;
        int last ;
        if (number > 0)
        {
            while (number<0 ||number>0)
            {
                last = number % 10; //logic to check number is even or not
                if (last % 2 == 0)
                {
                    result += last; //sum of even number
                }
                number = number / 10;
            }
            return result;  //print result
        }
        return -1;
    }
}
