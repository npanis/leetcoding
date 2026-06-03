public class StringCompression {

    public static int compress(char[] chars) {
        // ------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Compress the character array by replacing
        // repeated characters with the character
        // followed by the count of its repeats.
        //
        // The compression is done in-place and the
        // method returns the new length of the array.
        //
        // If a character appears once, just keep it.
        // ------------------------------------------
        // Iterate the array
        if (chars.length == 0) return 0;

        int write = 0; // where to write
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                // write previous character
                chars[write++] = chars[i - 1];

                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }

                count = 1;
            }
        }

        // 🔥 HANDLE LAST GROUP
        chars[write++] = chars[chars.length - 1];
        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                chars[write++] = c;
            }
        }

        return write;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " + compress(
                new char[]{'a','a','b','b','c','c','c'}));  // 6

        System.out.println("→ " + compress(
                new char[]{'a'}));  // 1

        System.out.println("→ " + compress(
                new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));  // 4

        System.out.println("→ " + compress(
                new char[]{'a','a','a','a','a','a','a','a','a','a','a'}));  // 3

        System.out.println("→ " + compress(
                new char[]{}));  // 0
    }

}

