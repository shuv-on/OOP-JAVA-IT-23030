import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class ASS01 {
    public static void main(String[] args) {
        try {
            File file = new File("/mnt/Academic/2nd year 1st semester/OOP/Assignment/FAssignment/inputASS01.txt");
            if (!file.exists()) {
                System.out.println("Error: Input file does not exist!");
                return;
            }
            Scanner input = new Scanner(file);
            ArrayList<Integer> num = new ArrayList<>();
            while (input.hasNextLine()) {
                String line = input.nextLine().trim();
                if (line.isEmpty()) continue;
                String[] values = line.split(",");
                for (String val : values) {
                    val = val.trim();
                    if (!val.isEmpty()) {
                        num.add(Integer.parseInt(val));
                    }
                }
            }
            input.close();
            int sum = num.stream().mapToInt(Integer::intValue).sum();
            int max_number = Collections.max(num);
            File outFile = new File("/mnt/Academic/2nd year 1st semester/OOP/Assignment/FAssignment/outputASS01.txt");
            PrintWriter writer = new PrintWriter(outFile);
            writer.println("Series sum = " + sum);
            writer.println("Max Number is : " + max_number);
            writer.print("Numbers: ");
            for (int i = 0; i < num.size(); i++) {
                writer.print(num.get(i));
                if (i < num.size() - 1) {
                    writer.print(", ");
                }
            }
            writer.println();

            writer.close();
            System.out.println("Sum: " + sum);
            System.out.println("Max Number: " + max_number);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in file!");
        }
    }
}
