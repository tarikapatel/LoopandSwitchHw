import java.util.Scanner;
//11.	WAP to enter any String and count total number of 'a' in that String.
public class CountCharacterInString
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any word:  ");
        String input = scan.nextLine();
        int times = 0 ;

        for (int position = 0; position < input.length(); position++)
        {
            if (input.charAt(position) == 'a')
            {
                times++;
            }
        }
        System.out.println("'a' appears " + times + " times in this word.");
    }
}
