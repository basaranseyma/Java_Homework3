import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variables
        double a, b, c, s, A;

        // get data from the user
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the triangle: ");
        a = inp.nextInt();
        System.out.print("Enter the length of the second side of the triangle: ");
        b = inp.nextInt();
        System.out.print("Enter the length of the third side of the triangle: ");
        c = inp.nextInt();

        // checked if the lengths form a triangle
        if (a > 0 && b > 0 && c > 0) { // side lengths should be greater than zero
            if ((a + b) > c && (a + c) > b && (b + c) > a) { // the sum of any two sides should be greater than the third side
                // calculate the triangle's area
                s = (a + b + c) / 2;
                A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("The area of the triangle: " + A);
                } else System.out.println("A triangle cannot be formed with these side lengths.");
            } else { System.out.println("Side lengths should be greater than zero.");
        }
    }
}