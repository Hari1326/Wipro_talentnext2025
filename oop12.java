import java.util.Scanner;

public class oop12 {

    public static String getFirstHalf(String input) {
        if (input.length() % 2 == 0) {
            return input.substring(0, input.length() / 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = getFirstHalf(input);

        System.out.println("Result: " + result);

        scanner.close();
    }
}

