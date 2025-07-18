import java.util.Scanner;

public class oop18 {

    public static String repeatLastNChars(String input, int n) {
        if (n < 0 || n > input.length()) {
            return "Invalid input: n must be between 0 and length of the string.";
        }

        String lastN = input.substring(input.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        String output = repeatLastNChars(input, n);
        System.out.println("Result: " + output);

        scanner.close();
    }
}

