import java.util.Scanner;

public class oop15 {
    public static String removeX(String input) {
 
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        int start = 0;
        int end = input.length();
        if (input.charAt(0) == 'x' || input.charAt(0) == 'X') {
            start = 1;
        }
 
        if (input.charAt(input.length() - 1) == 'x' || input.charAt(input.length() - 1) == 'X') {
            end = end - 1;
        }
        
        return input.substring(start, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeX(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

