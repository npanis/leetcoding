import java.util.*;
public class MissingNumber {
        public static int missingNumber(int[] nums) {
            // ----------------------------------------------------
            // Given an array of integers from 0 to n (missing one),
            // this method finds and returns the missing number.
            // It uses the sum formula to calculate what the sum
            // *should* be and compares it to the actual total.
            // ----------------------------------------------------
            // Use triangular number to get the total sum )sum  = n(n+1) / 2
            long n = nums.length;
            long expectedSum = (n * (n + 1)) / 2;
            long diff = expectedSum;
            for (int num : nums) {
                diff -= num;
            }

            return (int) diff;

        }


        public static void main(String[] args) {

            // Do not change the code in the main method

            System.out.println("→ " +
                    missingNumber(new int[]{3, 0, 1}));       // 2

            System.out.println("→ " +
                    missingNumber(new int[]{0, 1}));          // 2

            System.out.println("→ " +
                    missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));  // 8

            System.out.println("→ " +
                    missingNumber(new int[]{0}));             // 1

            System.out.println("→ " +
                    missingNumber(new int[]{1}));             // 0

        }
}
