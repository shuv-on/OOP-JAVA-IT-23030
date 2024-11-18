//Financial application
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sub,gr;
        sub=input.nextDouble();
        gr = input.nextDouble();
        double grat=sub*gr/100.0;
        double total=sub+grat;
        System.out.println("The gratuity is $"+grat+" and total is $"+total);
    }
}
