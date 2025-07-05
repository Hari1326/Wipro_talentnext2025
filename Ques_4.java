package java_fundamentals;
import java.util.Scanner;

public class Ques_4{

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char ch1 = sc.next().charAt(0);
			char ch2 = sc.next().charAt(0);
			System.out.println(ch2 + " , " + ch1);
			}
	}
}