import java.util.Scanner;

public class Ex4 {

    // shatrudhan.web.developer

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in km : ");
        double a = sc.nextDouble();
        double b = a * 0.621;

        System.out.println("Distance in miles is " + b);

        sc.close();
    }
}