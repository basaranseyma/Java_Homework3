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

        // calculate the triangle's area and inform the user
        s = (a + b + c) / 2;
        A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle: " + A);
    }
}