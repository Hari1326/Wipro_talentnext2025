package java_fundamentals;
public class Ques_1a {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a > 0) {
			System.out.println("Positive number");
		} else if (a < 0) {
			System.out.println("Negative number");
		} else if (a == 0) {
			System.out.println("Zero");
		}
	}
}
