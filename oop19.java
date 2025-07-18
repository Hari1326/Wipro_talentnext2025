import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class oop19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        // Read n names from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

        // Use StringJoiner to join names with comma and enclose in {}
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            joiner.add(name);
        }

        System.out.println("Result: " + joiner.toString());

        scanner.close();
    }
}

