import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {

    // shatrudhan.web.developer

    public static void main(String[] args) throws IOException {

        /*
         * Write a java program to take two integer numbers input and print their sum,
         * difference, product and quotient.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input from user
        System.out.print("Enter 1st number : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter 2nd number : ");
        int num2 = Integer.parseInt(br.readLine());

        // Condition
        int sum = num1 + num2; // Sum - (+)
        int diff = num1 - num2; // Difference - (-)
        int prod = num1 * num2; // Product - (*)
        int quot = num1 / num2; // Quotient - (/)

        // Output
        System.out.println("Value of sum + " + sum);
        System.out.println("Value os difference = " + diff);
        System.out.println("Value of product = " + prod);
        System.out.println("Value of qoutient = " + quot);
    }
}