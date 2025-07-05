package java_fundamentals;
import java.util.Scanner;
public class Ques_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		int n = Math.abs(number);
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		System.out.println("Sum of digits: " + sum);
		scanner.close();

	}

}
