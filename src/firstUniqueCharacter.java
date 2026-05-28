import java.util.*;
public class firstUniqueCharacter {

    public static int firstUniqueChar(String text) {
        // -----------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method finds the index of the first character in a
        // string that does not repeat. It uses a HashMap to count
        // character frequencies.
        //
        // Returns -1 if no unique character exists.
        // -----------------------------------------------------------
        // Instead of counting add the index so looks key is the letter and indeces are the value
        HashMap<Character, Integer> seenMap = new HashMap<>();
        char currentChar;
        for(char a : text.toCharArray()){
            if(!seenMap.containsKey(a)){
                seenMap.put(a, 0);
            }
            else {
                Integer count = seenMap.get(a);
                seenMap.put(a, count + 1);
            }
        }

        for(int i = 0; i  < text.length(); i++){
            currentChar = text.charAt(i);
            if(seenMap.get(currentChar) == 0){
                return i;
            }
        }

        return -1;

    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                firstUniqueChar("leetcode"));        // 0

        System.out.println("→ " +
                firstUniqueChar("loveleetcode"));    // 2

        System.out.println("→ " +
                firstUniqueChar("aabb"));            // -1

        System.out.println("→ " +
                firstUniqueChar("abcabcde"));        // 6

        System.out.println("→ " +
                firstUniqueChar(""));                // -1
    }

}
