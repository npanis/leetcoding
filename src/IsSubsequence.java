public class IsSubsequence {
        public static boolean isSubsequence(String string1, String string2) {
            // ----------------------------------------------------
            // This method checks if string1 is a subsequence
            // of string2. A subsequence means all the characters
            // of string1 must appear in string2 in order,
            // but not necessarily next to each other.
            // ----------------------------------------------------
            // 1. Empty string is always a subset
            if (string1.isBlank()) return true;

            // 2. Loops. Run through the subset
            int pString1 = 0;
            int pString2 = 0;

            while(pString2 < string2.length()){
                // if the subset char matches the string char move on the next
                if (string1.charAt(pString1) == string2.charAt(pString2)){
                    pString1++;
                }

                // if the subset is covered and all char matches the length is over.

                if (pString1 == string1.length()){
                    return true;
                }
                pString2++;
            }
            return false;
        }





        public static void main(String[] args) {

            // Do not change the code in the main method

            System.out.println("\"abc\", \"ahbgdc\" → " +
                    isSubsequence("abc", "ahbgdc"));       // true

            System.out.println("\"axc\", \"ahbgdc\" → " +
                    isSubsequence("axc", "ahbgdc"));       // false

            System.out.println("\"\", \"abc\" → " +
                    isSubsequence("", "abc"));             // true

            System.out.println("\"abc\", \"\" → " +
                    isSubsequence("abc", ""));             // false

            System.out.println("\"ace\", \"abcde\" → " +
                    isSubsequence("ace", "abcde"));        // true
        }

}
