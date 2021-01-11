package exercise2_25;

import java.util.Scanner;

public class OddOrEven {

        public static void main(String[] args) {

            // Initialize variable
            Scanner input=new Scanner(System.in);
            int number;

            System.out.println("Enter a number:");
            number=input.nextInt();

            // Check if it's even or odd
            if(number(number)){
                System.out.println(number + " is even");
            }
            else{
                System.out.println(number + " is odd");
            }
        }
        public static boolean number(int num){
            if((num%2)==0)
                return true;
            else
                return false;
    }
}
