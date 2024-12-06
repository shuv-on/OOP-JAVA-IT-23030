import java.util.*;

public class Factorion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Range number: ");
        int num = input.nextInt();
        factMain myFact = new factMain();
        myFact.findFactorial(num);
    }
}
