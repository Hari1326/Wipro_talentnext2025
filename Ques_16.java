package java_fundamentals;
import java.util.Scanner;
public class Ques_16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int reversed = 0;
		int n = Math.abs(number);
		while (n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		if (number < 0) {
			reversed = -reversed;
		}
		System.out.println("Reversed number: " + reversed);
		scanner.close();

	}
}
