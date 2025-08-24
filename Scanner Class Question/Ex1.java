import java.util.*;

public class Ex1 {

    // shatrudhan.web.developer

    // Ek string lo or uska reverse print karo.

    public static void main(String[] args) {

        // Create a scanner object for reading input from console.
        Scanner sc = new Scanner(System.in);

        // Scanner object creat
        System.out.print("Enter your name  : ");
        String name = sc.nextLine();

        // Name reverse karna
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }

        // Output print karna
        System.out.println("Reverse name = " + reverse);

        sc.close();
    }
}