import java.util.*;
import java.lang.Math;
public class MathPractice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Equation 1: Right Triangle Height
        System.out.println("Equation 1: Calculate the height of a right triangle.");
        System.out.print("Enter base (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter angle (theta in degrees): ");
        double theta = scanner.nextDouble();
        double height = b * Math.tan(Math.toRadians(theta));
        System.out.println("Height: " + height);

        // Equation 2: Compound Interest
        System.out.println("\nEquation 2: Compound Interest Calculation.");
        System.out.print("Enter Principal (P): ");
        double P = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (r as a decimal): ");
        double r = scanner.nextDouble();
        System.out.print("Enter Number of Compounds per Year (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter Time in Years (t): ");
        double t = scanner.nextDouble();
        double A = P * Math.pow(1 + r / n, n * t);
        System.out.println("Total Amount: " + A);

        // Equation 3: Cartesian to Polar
        System.out.println("\nEquation 3: Convert Cartesian to Polar Coordinates.");
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        double rPolar = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double thetaPolar = Math.toDegrees(Math.atan(y / x));
        System.out.println("Radius: " + rPolar + ", Angle: " + thetaPolar + "°");

        // Equation 4: Distance Between Two Points
        System.out.println("\nEquation 4: Calculate Distance Between Two Points.");
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);

        // Equation 5: Quadratic Equation
        System.out.println("\nEquation 5: Solve Quadratic Equation.");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double bQuad = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        double discriminant = Math.pow(bQuad, 2) - 4 * a * c;
        if (discriminant >= 0) {
            double root1 = (-bQuad + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-bQuad - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
            if (root1 >= 0 && root2 >= 0) {
                System.out.println("Smallest positive root: " + Math.min(root1, root2));
            } else if (root1 >= 0) {
                System.out.println("Smallest positive root: " + root1);
            } else if (root2 >= 0) {
                System.out.println("Smallest positive root: " + root2);
            } else {
                System.out.println("No positive roots.");
            }
        } else {
            System.out.println("No real roots.");
        }

        scanner.close();
    }
}
