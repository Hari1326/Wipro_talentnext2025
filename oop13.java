import java.util.Scanner;

public class oop13 {

    public static String removeFirstAndLast(String input) {
        if (input.length() <= 2) {
            return "";
        } else {
            return input.substring(1, input.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeFirstAndLast(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
