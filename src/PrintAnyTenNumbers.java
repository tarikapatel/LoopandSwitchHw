import java.util.Scanner;
//1.	Print any 10 numbers between given/user input range. For eg. Print numbers between 23-33
public class PrintAnyTenNumbers
{
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter starting range number: ");
        int number1 = scan.nextInt();
        System.out.print("Please enter ending range number: ");
        int number2 = scan.nextInt();

        if (number1 + 10 == number2) {
            for (int i = number1; i <= number2; i++)
            {System.out.println("Range of number: " + i);}
        }
        else
        {
            System.out.println("The input number is out of range.");
        }
    }
}
