import java.util.Scanner;
//5.	Finding factorial of a number entered by user
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num;
        int factorial = 1, i;
        num = scan.nextInt();

        for (i = 1; i <= num; i++)
        //for (i=1; i>=num; i--)
        {
            factorial = factorial * i;
        }
        if (num < 0)//invalid sceanrio
        {
            System.out.println("Cannot find the factorial of negative number.");
        } else {
            System.out.println(num + " ! " + " = " + factorial);
        }
    }
}
/*
The factorial of a integer n, denoted by n!, is the product of all positive integers less than or equal to n.
Factorial does not exist for negative numbers and factorial of 0 is 1. Its most basic occurrence is the fact that there are n! ways to arrange n distinct objects into a sequence.
N! = 1*2*3*4*.... *(N-2)*(N-1)*N
 */

/*

// --------------------------------second code-----------------------
public static void main(String[]args){
int number;
long factorial = 1;
Scanner scan= new Scanner(System.in);
System.out.println("Enter a number:");
number = scan.nextInt();
if(number<0){
System.out.println("Can't find the factorial of negative number");
}
else if(number<=1){
    System.out.printf("%d! = %d", number,factorial);
}
else
{
    for (int counter = number; counter>=0 ; counter--)
    {
        factorial = factorial * counter;
    }
    System.out.printf("%d! = %d",number,factorial);
}
}
}

     */