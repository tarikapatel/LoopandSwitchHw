import java.util.Scanner;
//3.	Program to check whether input number is prime or not
public class PrimeNumberOrNot
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = scan.nextInt();
        boolean flag = false;

        for (int i = 2; i <= no / 2; ++i)
        {
            // condition for nonprime number
            if (no % i == 0)
            {
                flag = true;
                break;
            }
        }
        /* flag variable is declared as false, so now when we say (!flag) in if condition below
        that means (!false)=true then it prints as no. is a prime number */
        if (!flag)
        {
            System.out.println(no + " is a prime number.");
        } else
        {
            System.out.println(no + " is not a prime number.");
        }
    }
}