import java.util.Scanner;
//md shishir kaysar shuvon

public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Student ID: ");
        String stu_id = input.nextLine();
        System.out.println("Number of courses: ");
        int n = input.nextInt();
        double cg = getInput(n, input);
        double cgpa = cg / n;

        System.out.println("Student ID: " + stu_id);
        System.out.println("Credit Total: " + (n * 3));
        System.out.println("Credit Earned: " + (n * 3));
        System.out.println("CGPA: " + String.format("%.2f", cgpa));
    }
    public static double getInput(int n, Scanner input) {
        if (n == 0) {
            return 0.0;
        }
        System.out.println("Credit (Max = 3)");
        System.out.print("CT (Max = 30): ");
        int ct_in = input.nextInt();
        System.out.print("AT (Max = 10): ");
        int at_in = input.nextInt();
        System.out.print("FE (Max = 60): ");
        int fe_in = input.nextInt();
        int total = 100;
        int obtain = ct_in + at_in + fe_in;
        if (obtain > total) {
            obtain = total;
        }
        double gpa = ((double) obtain / total) * 4.0;
        return gpa + getInput(n - 1, input);
    }
}
