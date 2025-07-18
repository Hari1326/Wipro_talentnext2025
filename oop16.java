import java.util.Scanner;

public class oop16 {

    public static String removeStars(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*'
                || (i > 0 && input.charAt(i - 1) == '*')
                || (i < input.length() - 1 && input.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(input.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with '*': ");
        String input = scanner.nextLine();

        String output = removeStars(input);
        System.out.println("Result: " + output);

        scanner.close();
    }
}
