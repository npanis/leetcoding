import java.util.*;

public class Anagram {
    public static boolean isAnagram(String string1, String string2) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Return true if string1 and string2 are
        // anagrams of each other.
        //
        // Use HashMap with get() and null checks.
        // Do not use any sort methods.
        // ----------------------------------------
        // Anagram should have the same number of letters.
        // 1. Compare the letters and pop the other string. Both should be done. Both should be exhausted.

        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();
        if(string1.length() != string2.length()) return false;
        Arrays.sort(string1Array);
        Arrays.sort(string2Array);

        return Arrays.equals(string1Array, string2Array);

    }

    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"listen\", \"silent\" → " +
                isAnagram("listen", "silent"));  // true

        System.out.println("\"hello\", \"world\" → " +
                isAnagram("hello", "world"));    // false

        System.out.println("\"anagram\", \"nagaram\" → " +
                isAnagram("anagram", "nagaram")); // true

        System.out.println("\"rat\", \"car\" → " +
                isAnagram("rat", "car"));        // false

        System.out.println("\"aacc\", \"ccac\" → " +
                isAnagram("aacc", "ccac"));      // false
    }
}
