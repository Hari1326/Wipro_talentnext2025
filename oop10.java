import java.util.Scanner;
public class oop10 {

    public static String smartConcat(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str2 = str2.substring(1); 
        }

        return str1 + str2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        String result = smartConcat(str1, str2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

