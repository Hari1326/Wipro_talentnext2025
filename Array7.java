import java.util.*;
public class Array7 {
	    public static void main(String[] args) {
	        int[] input = {12, 34, 12, 45, 67, 89};
	        Set<Integer> uniqueSet = new LinkedHashSet<>();
	        for (int num : input) {
	            uniqueSet.add(num);
	        }
	        Integer[] output = uniqueSet.toArray(new Integer[0]);
	        System.out.println("Array after removing duplicates: " + Arrays.toString(output));
	    }
	}