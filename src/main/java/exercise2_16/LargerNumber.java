package exercise2_16;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Initialize variables
        int num1;
        int num2;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        //Comparing variables; if is used for 3 defined cases
        if (num1 > num2)
            System.out.printf("%d is larger than %d\n",num1,num2);

        if (num1 < num2)
            System.out.printf("%d is larger than %d\n", num2, num1);

        if (num1 == num2)
            System.out.println("These numbers are equal");

    }
}
