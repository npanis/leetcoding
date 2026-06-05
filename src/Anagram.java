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
        // Anagram should have the same number of letters, length and number of frequencies
        // Create hashmap count the number of frequencies in string 1
        HashMap<Character, Integer> mapString1 = new HashMap<>();
        if(string1.length() != string2.length()) return false;

        for(char s : string1.toCharArray()) {
            if(!mapString1.containsKey(s)){
                mapString1.put(s, 1);
            }
            else mapString1.put(s, mapString1.get(s) + 1);
        }
        // Subtract matches on String2
        for (char t : string2.toCharArray()){
            if(mapString1.containsKey(t)) {
                mapString1.put(t, mapString1.get(t) - 1);
            }
            else return false;
        }

        for ( int value : mapString1.values()) {
            if (value != 0) return false;
        }

        return true;

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
