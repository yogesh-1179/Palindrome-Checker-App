public class UC4 {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "racecar"; // Change this to test other words

        // Convert string to char array
        char[] chars = word.toCharArray();

        // Check if it is a palindrome
        if (isPalindrome(chars)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    // Method to check palindrome using two-pointer approach
    private static boolean isPalindrome(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Palindrome
    }
}