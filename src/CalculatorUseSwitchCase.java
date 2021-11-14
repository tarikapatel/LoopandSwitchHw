/* 7.Making Calculator using the switch statement(The program takes three inputs from the user:
one operator and 2 numbers. Based on the operator provided by the user, it performs the calculation
on the numbers. Then the result is displayed on the screen.)&/
 */

import java.util.Scanner;

public class CalculatorUseSwitchCase {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first digit: ");
        int no1 = scan.nextInt();
        System.out.print("Enter your second digit: ");
        int no2 = scan.nextInt();
        System.out.print("Enter your operator you want: (+,-,*,/)");
        char operator = scan.next().charAt(0);

        switch (operator)
        {       //performs addition between numbers
            case '+':
            System.out.println("Total of "+ no1 +" + "+no2 +" = " + (no1+no2));
            break;
                // performs subtraction between numbers
            case '-':
            System.out.println( no1 + " - " + no2 + " = "+ (no1-no2));
            break;
                // performs multiplication between numbers
            case '*':
            System.out.println(no1 + " * "+ no2+ " = "+ (no1*no2));
            break;
                // performs division between numbers
            case '/' :
            System.out.println(no1 + " / "+ no2+ " = "+ (no1/no2));
            break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }

}
