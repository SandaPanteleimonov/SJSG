package exercise2_15;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        // Initialize variables for each operation
        int num1;
        int num2;
        int sum;
        int difference;
        int product;
        int division;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        //Operations
        sum	= num1 + num2;
        product	= num1 * num2;
        difference = num1 - num2;
        division = num1 / num2;

        //Print of results
        System.out.printf("Sum is %d\n", +sum);
        System.out.printf("Product is %d\n", +product);
        System.out.printf("Difference is %d\n", +difference);
        System.out.printf("Quotient is %d\n", +division);
    }
}

