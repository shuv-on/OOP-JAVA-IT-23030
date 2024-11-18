//Find the numbers of year
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minit;
        minit=input.nextInt();
        int year=minit/(365*24*60);
        int day=(minit-year*365*24*60)/(24*60);
        System.out.println(minit+"minutes is approximately "+year+" years and "+day+" days");
    }
}
