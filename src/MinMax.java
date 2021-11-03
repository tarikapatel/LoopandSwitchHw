import java.util.Scanner;
//12.	Write a program in Java to find min and max number from any 3 numbers which user enters.
public class MinMax
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();
        System.out.print("Enter third number: ");
        int n3 = scan.nextInt();
        System.out.print("Enter your choice by choosing 1 for Maximum number and 2 for Minimum number : ");
        int minMax = scan.nextInt();

        switch(minMax) {
            case 1:
                int max = Math.max(n1, Math.max(n2, n3));
                System.out.println("out of " + n1 + ", " + n2 + ", " + "and " + n3 + " - " + " the maximum number is: "+ max);
                break;
            case 2:
                int min = Math.min(n1, Math.min(n2, n3));
                System.out.println("out of " + n1 + ", " + n2 + ", " + "and " + n3 + " - " + " the minimum number is: "+ min);
                break;

        }
    }
}
