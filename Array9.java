import java.util.Arrays;
public class Array9 {
	  public static void main(String[] args) {
	        int[] arr = {1, 10, 10, 2};
	        int[] result = new int[arr.length];
	        int index = 0;
	        for (int num : arr) {
	            if (num != 10) {
	                result[index++] = num;
	            }
	        }
	        System.out.println("Result: " + Arrays.toString(result));
	    }
	}


