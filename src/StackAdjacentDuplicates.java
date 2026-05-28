import java.util.*;
public class StackAdjacentDuplicates {
    public static String removeAdjacentDuplicates(String input) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given a string, remove all adjacent
        // duplicate characters in pairs.
        //
        // Use a stack to solve the problem.
        // Return the final string.
        // ----------------------------------------
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int n = sb.length();
            if (n > 0 && sb.charAt(n - 1) == c) {
                sb.deleteCharAt(n - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }




    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"abbaca\" → " +
                removeAdjacentDuplicates("abbaca"));     // ca

        System.out.println("\"azxxzy\" → " +
                removeAdjacentDuplicates("azxxzy"));     // ay

        System.out.println("\"aabcca\" → " +
                removeAdjacentDuplicates("aabcca"));     // ba

        System.out.println("\"abcddcba\" → " +
                removeAdjacentDuplicates("abcddcba"));   // (empty)

        System.out.println("\"\" → " +
                removeAdjacentDuplicates(""));           // (empty)
    }

}
