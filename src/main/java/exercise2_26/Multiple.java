package exercise2_26;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {

        //Initialize variables
        Scanner input=new Scanner(System.in);
        int num1= 0;
        int num2 = 0;

        System.out.println("Enter first number:");
        num1=input.nextInt();

        System.out.println("Enter second number:");
        num2=input.nextInt();

        // Controw flow if for 2 cases
        if(number(num1, num2)){
            System.out.println(num1 + " is a multiple of " + num2);
        }
        else{
            System.out.println(num1 + " is  not a multiple of " + num2);
        }

    }
        //Check if the first is a multiple of the second
    public static boolean number(int num1, int num2){
        if((num1%num2)==0)
            return true;
        else
            return false;

    }
}

