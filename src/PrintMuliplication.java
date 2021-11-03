import java.util.Scanner;
//10.	Java Program to Print Multiplication Table for any Number
public class PrintMuliplication
{
    public static void main(String[]args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();

        //initiallization of i from 1 as table need to start from 1
        for(int i = 1; i<= 12;i++)
        {
            System.out.println(number +" * "+ i + " = "+ number * i);
        }
    }

}
