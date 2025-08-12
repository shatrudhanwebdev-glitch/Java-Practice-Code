import java.io.*;

public class Ex1 {

    // shatrudhan.web.developer

    public static void main(String[] args) throws IOException {

        // Create a BufferedReader object for reading input from console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user for the first number and read input
        System.out.print("Enter 1st number : ");
        int num1 = Integer.parseInt(br.readLine());

        // Prompt user for the second number and read input
        System.out.print("Enter 2nd number : ");
        int num2 = Integer.parseInt(br.readLine());

        // Perform arithmetic operations
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        // Display the results
        System.out.println("Value of sum num1 and num2 = " + sum);
        System.out.println("Value os sub num1 and num2 = " + sub);
        System.out.println("Value of mul num1 and num2 = " + mul);
        System.out.println("Value of div num1 and num2 = " + div);
    }
}