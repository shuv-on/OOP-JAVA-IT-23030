import java.util.Scanner;
class BaseClass {
    void printResult(String message) {
        System.out.println(message);
    }
}
class SumClass extends BaseClass {
    double computeSum() {
        double sum = 0.0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        return sum;
    }
}
class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
class NumberConversionClass extends BaseClass {
    String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    String decimalToHex(int num) {
        return Integer.toHexString(num).toUpperCase();
    }

    String decimalToOctal(int num) {
        return Integer.toOctalString(num);
    }
}
class CustomPrintClass extends BaseClass {
    void pr(String message) {
        System.out.println("==== " + message + " ====");
    }
}
public class ASS12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CustomPrintClass customPrint = new CustomPrintClass();
        customPrint.pr("Sum of Series");
        SumClass sumObj = new SumClass();
        double seriesSum = sumObj.computeSum();
        sumObj.printResult("Sum of the series: " + seriesSum);
        customPrint.pr("GCD and LCM Calculation");
        DivisorMultipleClass divisorObj = new DivisorMultipleClass();
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = divisorObj.gcd(num1, num2);
        int lcm = divisorObj.lcm(num1, num2);
        divisorObj.printResult("GCD: " + gcd + ", LCM: " + lcm);
        customPrint.pr("Number Conversions");
        NumberConversionClass conversionObj = new NumberConversionClass();
        System.out.print("Enter a decimal number: ");
        int dec = input.nextInt();
        conversionObj.printResult("Binary: " + conversionObj.decimalToBinary(dec));
        conversionObj.printResult("Hexadecimal: " + conversionObj.decimalToHex(dec));
        conversionObj.printResult("Octal: " + conversionObj.decimalToOctal(dec));

        input.close();
    }
}
