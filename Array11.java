public class Array11 {
	public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4};
        boolean only14 = true;
        for (int num : arr) {
            if (num != 1 && num != 4) {
                only14 = false;
                break;
            }
        }
        System.out.println("Result: " + only14);
    }
}
