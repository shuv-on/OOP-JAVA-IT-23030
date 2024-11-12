import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputSeries {
    public static void main(String[] args) {
        String input = "/mnt/Application/Series/input.txt";
        String output = "/mnt/Application/Series/output.txt";
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        try {
            Scanner scanner = new Scanner(new File(input));
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                if (number > maxValue) {
                    maxValue = number;
                }
            }
            scanner.close();
            PrintWriter writer = new PrintWriter(output);
            writer.println("Sum: " + sum);
            writer.println("Highest Value: " + maxValue);
            writer.close();
            System.out.println("Sum : " + sum);
            System.out.println("Highest : " + maxValue);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
