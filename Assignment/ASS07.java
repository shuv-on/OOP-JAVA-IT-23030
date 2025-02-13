import java.util.*;
//Md Shishir Kaysar Shuvon
public class ASS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter coefficients a, b, and c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double d = (b * b - 4 * a * c);
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / 2;
            double root2 = (-b - Math.sqrt(d)) / 2;
            double res = Math.min(root1, root2);
            System.out.println("The smallest positive root is: " + res);
        } else {
            System.out.println("No real root exist.");
        }
        sc.close();
    }
}
