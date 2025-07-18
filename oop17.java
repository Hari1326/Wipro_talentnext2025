import java.util.Scanner;

public class oop17 {

    public static String mixStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter second string: ");
        String b = scanner.nextLine();

        String output = mixStrings(a, b);
        System.out.println("Result: " + output);

        scanner.close();
    }
}

