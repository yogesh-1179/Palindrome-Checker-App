/**
 * UseCase2PalindromeCheckerApp
 * Version: 1.0
 * Description: Console-based Palindrome Checker - Hardcoded String (UC2)
 */

public class UC2 {

    public static void main(String[] args) {

        // UC2: Hardcoded string
        String word = "madam"; // Change this to test another word

        // Check if the word is palindrome
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    // Method to check palindrome
    private static boolean isPalindrome(String str) {
        // Remove spaces and ignore case
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}