import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class PangramChecker {

    public static boolean isPangram(String sentence) {
        // ------------------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method checks whether a given string is a pangram.
        // A pangram contains all 26 letters of the alphabet at least once.
        //
        // It uses a HashSet to collect each letter found.
        // ------------------------------------------------------------

        Set<Character> uniqueLetters = new HashSet<>();
        String lowerCaseSentence = sentence.toLowerCase();

        for(char l : lowerCaseSentence.toCharArray()) {
            if( l >= 'a' && l <= 'z' ){
                uniqueLetters.add(l);
            }
        }


        if(uniqueLetters.size() == 26) {
            return true;
        }

        return false;

    }






    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                isPangram("the quick brown fox jumps over the lazy dog"));  // true

        System.out.println("→ " +
                isPangram("hello world"));                                  // false

        System.out.println("→ " +
                isPangram("abcdefghijklmnopqrstuvwxyz"));                   // true

        System.out.println("→ " +
                isPangram("missing letters here"));                         // false

        System.out.println("→ " +
                isPangram("pack my box with five dozen liquor jugs"));      // true
    }
}

