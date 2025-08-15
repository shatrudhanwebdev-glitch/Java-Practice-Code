import java.util.Scanner;

public class Example4 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        /*
         * Write a java program that takes a number from the user and prints true if it
         * is even, otherwise false.
         */

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        // Condition for even number
        if (number % 2 == 0) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}
