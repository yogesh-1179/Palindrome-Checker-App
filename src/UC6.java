import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UC6 {

  public static void main(String[] args) {
    // Hardcoded string
    String word = "radar"; // Change this to test another word

    // Check if the word is a palindrome using Queue and Stack
    if (isPalindrome(word)) {
      System.out.println(word + " is a palindrome.");
    } else {
      System.out.println(word + " is not a palindrome.");
    }
  }

  // Method to check palindrome using Queue and Stack
  private static boolean isPalindrome(String str) {
    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();

    // Enqueue and push characters
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      queue.add(ch); // enqueue
      stack.push(ch); // push
    }

    // Compare dequeue vs pop
    while (!queue.isEmpty()) {
      if (!queue.remove().equals(stack.pop())) {
        return false; // Not a palindrome
      }
    }

    return true; // Palindrome
  }
}