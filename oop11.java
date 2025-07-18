import java.util.Scanner;

public class oop11 {

    public static String generateRepeatedPrefix(String input) {
        int length = input.length();
        String prefix;
        if (length < 2) {
            prefix = input;
        } else {
            prefix = input.substring(0, 2);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(prefix);
        }

        return result.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String output = generateRepeatedPrefix(input);
        System.out.println("Result: " + output);

        scanner.close();
    }
}
