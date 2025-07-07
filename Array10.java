import java.util.Arrays;
public class Array10 {
	 public static void main(String[] args) {
	        int[] arr = {1, 0, 1, 0, 0, 1, 1};
	        int[] result = new int[arr.length];
	        int start = 0;
	        int end = arr.length - 1;
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                result[start++] = num;
	            } else {
	                result[end--] = num;
	            }
	        }
	        Arrays.sort(result, start, result.length); 
	        System.out.println("Result: " + Arrays.toString(result));
	    }
}

 
