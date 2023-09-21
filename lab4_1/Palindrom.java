import org.junit.jupiter.api.Assertions;

public class Palindrom {
    public static boolean isPalindrome(String word) {
        // Ignore case and spaces.
        String normalizedWord = word.toLowerCase().replaceAll(" ", "");

        // Check if the word is a palindrome.
        int i = 0;
        int j = normalizedWord.length() - 1;
        while (i < j) {
            if (normalizedWord.charAt(i) != normalizedWord.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "madam";

        // This line will compile and run without errors.
        Assertions.assertTrue(isPalindrome(word));

        Assertions.assertTrue(isPalindrome("racecar"));

        Assertions.assertTrue(isPalindrome("hello"));
    }
}