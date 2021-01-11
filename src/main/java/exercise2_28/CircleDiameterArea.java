package exercise2_28;

import java.util.Scanner;

public class CircleDiameterArea {
    public static void main(String[]args){

        // Initialize variables
        Scanner input=new Scanner(System.in);
        int radius=0;
        double pie=Math.PI;

        System.out.println("Enter radius:");
        radius=input.nextInt();

        //Calculation of diameter, circumference and area
        System.out.printf("Diameter =  %.1f\n", 2*(double)radius);
        System.out.printf("Circumference =  %.1f\n", 2*pie*(double)radius);
        System.out.printf("Area =  %.1f", pie*(double)(radius*radius));
    }
}
