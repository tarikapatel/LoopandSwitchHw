import java.util.Scanner;

//4.	Reverse a number using for Loop
public class ReverseTheNumber
{
    public static void main(String[]args)
    { //This statement will capture the user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your number and press enter: ");
        int no = 0, reverse = 0;//initialize no

        //Captured input would be stored in number no
        no = scan.nextInt();
        /*for loop: No initialization part as no is already initialized and no increment/decrement part as logic
        no = no/10 already decrements the value of no*/
        //for( ;no!=0; no=no/10)
        for ( ; no!=0; )
        {
            //First, we find the remainder of the given number by using the modulus (%) operator
            int remainder =  no % 10; //eg: for no 1234 input, remainder = 1234 % 10 = 4
            //Multiply the variable reverse by 10 and add the remainder into it
            reverse = reverse * 10 + remainder; //eg.reverse = 0 * 10 + 4 = 0 + 4 = 4
            //Divide the number by 10.
            no = no/10;
            //internally now for next loop no. = number = 1234 / 10 = 123
            //Repeat the above steps until the number becomes 0.
        }
        System.out.println("Reverse of specified number is: "+ reverse);
        }
        /* eg input no. 1234
        Iteration 1:
        number = 1234
        remainder = 1234 % 10 = 4
        reverse = 0 * 10 + 4 = 0 + 4 = 4
        number = 1234 / 10 = 123
        Iteration 2 :
        number = 123
        remainder = 123 % 10 = 3
        reverse = 4 * 10 + 3 = 40 + 3 = 43
        number = 123 / 10 = 12
        Iteration 3:
        number = 12
        remainder = 12 % 10 = 2
        reverse = 43 * 10 + 2 = 430 + 2 = 432
        number = 12 / 10 = 1
        Iteration 4:
        number = 1
        remainder = 1 % 10 = 1
        reverse = 432 * 10 + 1 = 4320 + 1 = 4321
        number = 1 / 10 = 0

         */
}
