import java.util.HashSet;
import java.util.Set;

public class RepeatNumber {

    public static Integer firstRepeatingNumber(int[] nums) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // first number that appears more than once.
        //
        // Return null if no number repeats.
        // ----------------------------------------
        //Create a set
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
        return null;
    }

    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[2, 5, 1, 2, 3] → " +
                firstRepeatingNumber(new int[]{2, 5, 1, 2, 3}));

        System.out.println("[1, 2, 3, 4, 5] → " +
                firstRepeatingNumber(new int[]{1, 2, 3, 4, 5}));

        System.out.println("[7, 8, 9, 7, 8] → " +
                firstRepeatingNumber(new int[]{7, 8, 9, 7, 8}));

        System.out.println("[4, 4, 5, 6] → " +
                firstRepeatingNumber(new int[]{4, 4, 5, 6}));

        System.out.println("[] → " +
                firstRepeatingNumber(new int[]{}));

        System.out.println("[-1, -2, -3, -1] → " +
                firstRepeatingNumber(new int[]{-1, -2, -3, -1}));

    }

}

