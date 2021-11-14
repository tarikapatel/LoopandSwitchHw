import java.util.Scanner;
//8.	write a program that prints the sum of x ranging from 1 to 20.
public class PrintTheSumRangingOneToTwenty
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter starting range number: ");
        int number1 = scan.nextInt();
        System.out.print("Please enter ending range number: ");
        int number2 = scan.nextInt();
        int sumx = 0;

        if ((number1>=1)&&(number1 <= number2) && (number2<20))
        {
            for (int i = number1; i <= number2; ++i)
            {
                //adding the value of i into sum variable
                sumx = sumx + i;
            }
            System.out.print("Sum of x Numbers is = " + sumx);
        } else
        {
            System.out.println("The input number is out of range.");
        }
    }
}
