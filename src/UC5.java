import java.util.Stack;

public class UC5 {

  public static void main(String[] args) {
    // Hardcoded string
    String word = "level"; // Change this to test another word

    // Check if the word is a palindrome using a stack
    if (isPalindrome(word)) {
      System.out.println(word + " is a palindrome.");
    } else {
      System.out.println(word + " is not a palindrome.");
    }
  }

  // Method to check palindrome using stack
  private static boolean isPalindrome(String str) {
    Stack<Character> stack = new Stack<>();

    // Push each character into the stack
    for (int i = 0; i < str.length(); i++) {
      stack.push(str.charAt(i));
    }

    // Build reversed string by popping characters
    String reversed = "";
    while (!stack.isEmpty()) {
      reversed += stack.pop(); // Concatenating characters
    }

    // Compare original and reversed
    return str.equals(reversed);
  }
}