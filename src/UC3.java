public class UC3 {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "level"; // Change this to test other words

        // Reverse the string
        String reversed = reverseString(word);

        // Check if original and reversed are equal
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    // Method to reverse a string using a loop
    private static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); // String concatenation
        }
        return reversed;
    }
}