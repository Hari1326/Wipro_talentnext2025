
class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class oop2 {
    public static void main(String[] args) {
        int result1 = Calculator.powerInt(2, 3); 
        System.out.println("2 raised to power 3 is: " + result1);
        double result2 = Calculator.powerDouble(2.5, 3);  
        System.out.println("2.5 raised to power 3 is: " + result2);
    }
}
