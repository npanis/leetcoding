import java.util.HashMap;

public class MajorityElementGet {

    public static int majorityElement(int[] nums) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Finds the majority element in an array of integers.
        // A majority element is the one that appears more than
        // n / 2 times. It is guaranteed to exist in the input.
        //
        // This solution uses a HashMap to count occurrences.
        // ------------------------------------------------------------
        HashMap<Integer, Integer> majorityMap = new HashMap<>();
        int count =  nums.length / 2;
        int maxNum = 0;
        // Iterate with the array:
        if(nums.length == 1) return nums[0];
        for (int num : nums) {
            if (majorityMap.containsKey(num)) {
                // get value and add 1
                int ctr = majorityMap.get(num) + 1;
                majorityMap.put(num, ctr);
            } else majorityMap.put(num, 1);
        }
        // Place a holder for the most count and the key so we can track it
        for (int num : nums){
            if(majorityMap.get(num) > count){
                maxNum = num;
                count = majorityMap.get(num);
            }
        }
        return maxNum;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                majorityElement(new int[]{3, 2, 3}));           // 3

        System.out.println("→ " +
                majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // 2

        System.out.println("→ " +
                majorityElement(new int[]{1}));                 // 1

        System.out.println("→ " +
                majorityElement(new int[]{5, 5, 5, 5}));         // 5

        System.out.println("→ " +
                majorityElement(new int[]{4, 4, 2, 4}));         // 4
    }

}
