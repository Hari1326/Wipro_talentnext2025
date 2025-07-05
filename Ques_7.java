package java_fundamentals;
public class Ques_7 {

	public static void main(String[] args) {
		char ch = 'B';
		if (Character.isLowerCase(ch)) {
			char upper = Character.toUpperCase(ch);
			System.out.println(ch + "->" + upper);
		} else if (Character.isUpperCase(ch)) {
			char lower = Character.toLowerCase(ch);
			System.out.println(ch + "->" + lower);
		} else {
			System.out.println("Please enter an alphabet character.");
		}

	}

}