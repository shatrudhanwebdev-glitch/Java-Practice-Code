import java.util.Scanner;

public class Example2 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        /*
         * Write a java program to input the radius of a circle (double) and calculate
         * its area and circumference.
         */

        Scanner sc = new Scanner(System.in);

        // Input radius from user
        System.out.println("Enter radiu : ");
        double radius = sc.nextDouble();

        // Condition
        double Area = 3.14 * radius * radius;
        double Circumference = 2 * 3.14 * radius;

        System.out.println("Area of circle + " + Area);
        System.out.println("Value of circumference = " + Circumference);

    }
}
