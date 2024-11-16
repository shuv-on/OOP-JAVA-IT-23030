import java.util.Scanner;
class ch2ex2 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double radius=input.nextInt();
       double a=input.nextInt();
       double b=input.nextInt();
       System.out.println("Area : "+ (radius*radius*3.1416));
       System.out.println("Volume : "+ a*b);
    }
}
