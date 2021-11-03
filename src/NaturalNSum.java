import java.util.Scanner;
//6.6.	Display Sum of n Natural Number
public class NaturalNSum
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int no = scan.nextInt();
        int sum = 0;

        for (int i = 0; i<=no; ++i)
        {
            //adding the value of i into sum variable
            sum = sum +i;
        }
        System.out.print("Sum of First 10 Natural Numbers is = " + sum);
    }
}
