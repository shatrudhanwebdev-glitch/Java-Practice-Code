import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {

    // shatrudhan.web.developer

    public static void main(String[] args) throws IOException {

        /*
         * Write a java program to take single character input from the user and print
         * its ASCII(American Standard Code for Information Interchange) value.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input character from user
        System.out.println("Enter a character : ");
        int ASCIIValue = br.read();

        // Character show karne ke liye
        char Character = (char) ASCIIValue;

        // Output
        System.out.println("Your enterd : " + Character);
        System.out.println("ASCII Value = " + ASCIIValue);

    }
}
