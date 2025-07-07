import java.util.Scanner;
public class Arrays3 {
    public static void main(String[] args) {
        int[] nums = {40, 29, 36, 12, 24};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == input) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
    }