import java.util.*;

public class ASS08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = input.nextLine();
        int letter = 0, digit = 0, space = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                space++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digit++;
            }else {
                letter++;
            }
        }
        System.out.println("Letter: " + letter);
        System.out.println("Whitespace: " + space);
        System.out.println("Digit: " + digit);
        input.close();
    }
}
