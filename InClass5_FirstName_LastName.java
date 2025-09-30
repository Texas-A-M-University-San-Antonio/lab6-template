/**
 * Name: [Enter Your Name Here]
 * Date: [Enter Today's Date]
 * Purpose: Write the purpose of InClass 5 here 
 * 
 */

import java.util.Scanner;

public class InClass5_FirstName_LastName 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number (0-15): ");
        
        int number = input.nextInt();

        
        String hexDigit;

        switch (number) 
        {
            case:
                hexDigit = "A";
                break;
            case:                    
                
            case:
                
            /*
             * How many cases do you need, according to the chart?
             */
                
            default:
                // For decimal values 0-9, remove the comment below to see how to convert the number
                // to a string using Integer.toString(decimal)
                // hexDigit = Integer.toString(decimal);
        }
        
        System.out.println("The hexadecimal value is: " + hexDigit);
 
        input.close();
    }
}