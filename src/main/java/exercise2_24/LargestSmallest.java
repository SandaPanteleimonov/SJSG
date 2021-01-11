package exercise2_24;

import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);

        // Initialization of variables
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int smallest;
        int largest;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        num3 = input.nextInt();

        System.out.print("Enter fourth integer: ");
        num4 = input.nextInt();

        System.out.print("Enter fifth integer: ");
        num5 = input.nextInt();

        // First integer is considered to be the smallest, for comparison
        smallest = num1;
        if (num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        if (num4 < smallest)
            smallest = num4;

        if (num5 < smallest)
            smallest = num5;

        // First integer is considered to be the largest, for comparison
        largest = num1;
        if (num2 > largest)
            largest = num2;

        if (num3 > largest)
            largest = num3;

        if (num4 > largest)
            largest = num4;

        if (num5 > largest)
            largest = num5;

        //Print results

        System.out.printf("Smallest integer is: %d\n", smallest);
        System.out.printf("Largest integer is %d\n", largest);
    }
}
