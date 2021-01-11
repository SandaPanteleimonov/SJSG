package exercise2_30;

import java.util.Scanner;

public class SeparatedDigits {
    public static void main(String[] args)
    {
        //Initialization of variables
        Scanner input = new Scanner(System.in);
        int num;

        // Introducing a number
        System.out.print("Enter a number with five digits: ");
        num = input.nextInt();

        //Case if number corresponds to requirements
        if ( (num >= 10000) && (num <= 99999) )
        {
            System.out.printf("%d   ", (num / 10000));
            System.out.printf("%d   ", (num / 1000) % 10);
            System.out.printf("%d   ", (num / 100) % 10);
            System.out.printf("%d   ", (num % 100) / 10);
            System.out.printf("%d   ", (num % 10));
        }

        //Case if number does not correspond to requirements
        if (num > 99999)
            System.out.println("You had entered a number more than five digits.");
        if (num <= 9999)
            System.out.println("You had entered a number less than five digits.");
    }
}
