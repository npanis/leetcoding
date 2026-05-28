import java.util.ArrayList;
import java.util.List;

public class ReverseSentence {
    public static String reverseWords(String sentence) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Reverse the order of words in the string.
        //
        // - Remove extra spaces
        // - Do not use split() or trim()
        //
        // Example:
        // "the sky is blue" → "blue is sky the"
        // ----------------------------------------
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for(int i=0; i < sentence.length(); i++ ){
            char c = sentence.charAt(i);
            if( c != ' '){
                currentWord.append(c);
            } else if (!currentWord.isEmpty()) {
                words.add(currentWord.toString());
                currentWord.setLength(0);
            }
        }

        if (!currentWord.isEmpty()) {
            words.add(currentWord.toString());
        }

        StringBuilder result = new StringBuilder();
        for(int a=words.size() - 1; a >= 0; a--){
            result.append(words.get(a));
            result.append(' ');

        }
        return result.toString();
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"the sky is blue\" → " +
                reverseWords("the sky is blue"));  // blue is sky the

        System.out.println("\"  hello world  \" → " +
                reverseWords("  hello world  "));  // world hello

        System.out.println("\"a good   example\" → " +
                reverseWords("a good   example"));  // example good a

        System.out.println("\"  Bob    Loves  Alice   \" → " +
                reverseWords("  Bob    Loves  Alice   "));  // Alice Loves Bob

        System.out.println("\"Alice does not even like bob\" → " +
                reverseWords("Alice does not even like bob"));
        // bob like even not does Alice
    }

}
