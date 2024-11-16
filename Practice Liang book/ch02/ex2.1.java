import java.util.Scanner;
class ch2ex1 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double c=input.nextDouble();
    System.out.println("Fahrenheit = "+ (((9/5)*c)+32));
  }
}
