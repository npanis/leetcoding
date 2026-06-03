import java.util.*;

public class ValidParenthesisCode {

    public static boolean isValid(String input) {
        // ----------------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // This method checks if a string made up of
        // parentheses is valid. Valid means that all opening
        // brackets are closed in the correct order.
        //
        // It uses a Stack and a Map to do the matching.
        // ----------------------------------------------------
        // Create a map that has all the close parenthesis
        HashMap<Character, Character> closeMap = new HashMap<>();
        // Add all closing parenthesis
        closeMap.put(')','(');
        closeMap.put(']','[');
        closeMap.put('}','{');

        // Create a Stack to pop
        Stack <Character> stack = new Stack<> ();


        // Iterate with the string:
        for (char c: input.toCharArray()){
            if (closeMap.containsKey(c)){
                // Get stack topElement.
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (!(closeMap.get(c) == topElement)) {
                    return false;
                }

            }
            else stack.push(c);

        }

        return stack.isEmpty();
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("\"()\" → " + isValid("()"));                  // true
        System.out.println("\"()[]{}\" → " + isValid("()[]{}"));          // true
        System.out.println("\"(]\" → " + isValid("(]"));                  // false
        System.out.println("\"([)]\" → " + isValid("([)]"));              // false
        System.out.println("\"{[]}\" → " + isValid("{[]}"));              // true
        System.out.println("\"\" → " + isValid(""));                      // true
        System.out.println("\"(\" → " + isValid("("));                    // false
    }

}

