import java.util.*;
public class RotateArray {
    public static void rotateArray(int[] nums, int k) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Rotates the given array to the right by k steps.
        // The rotation is done in-place using reversal.
        //
        // Use the helper method below (reverse) in this method.
        // ----------------------------------------
        if (nums.length == 0) return;   // handle empty array

        k = k % nums.length;            // handle k larger than array length
        if (k == 0) return;             // no rotation needed

        reverse(nums, 0, nums.length - 1);  // Step 1: reverse whole array
        reverse(nums, 0, k - 1);            // Step 2: reverse first k
        reverse(nums, k, nums.length - 1);  // Step 3: reverse the rest
    }


    // ----------------------------------------
    // Helper method to reverse part of array
    // from start to end index (inclusive)
    // ----------------------------------------
    public static void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }



    public static void main(String[] args) {

        // Do not change the code in the main method

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(arr1, 3);
        System.out.println("→ " + Arrays.toString(arr1));  // [5, 6, 7, 1, 2, 3, 4]

        int[] arr2 = {1, 2};
        rotateArray(arr2, 5);
        System.out.println("→ " + Arrays.toString(arr2));  // [2, 1]

        int[] arr3 = {10, 20, 30};
        rotateArray(arr3, 0);
        System.out.println("→ " + Arrays.toString(arr3));  // [10, 20, 30]

        int[] arr4 = {4, 3, 2, 1};
        rotateArray(arr4, 4);
        System.out.println("→ " + Arrays.toString(arr4));  // [4, 3, 2, 1]

        int[] arr5 = {};
        rotateArray(arr5, 1);
        System.out.println("→ " + Arrays.toString(arr5));  // []

    }
}
