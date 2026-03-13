public class PalindromeCheckerApp {

    // Method 1: Reverse String Method
    public static boolean reversePalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerPalindrome(String str) {
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

    public static void main(String[] args) {

        String input = "madam";

        // Algorithm 1 timing
        long startTime1 = System.nanoTime();
        boolean result1 = reversePalindrome(input);
        long endTime1 = System.nanoTime();
        long timeTaken1 = endTime1 - startTime1;

        // Algorithm 2 timing
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerPalindrome(input);
        long endTime2 = System.nanoTime();
        long timeTaken2 = endTime2 - startTime2;

        // Display results
        System.out.println("Input String: " + input);

        System.out.println("\nReverse String Method:");
        System.out.println("Is Palindrome: " + result1);
        System.out.println("Execution Time: " + timeTaken1 + " ns");

        System.out.println("\nTwo Pointer Method:");
        System.out.println("Is Palindrome: " + result2);
        System.out.println("Execution Time: " + timeTaken2 + " ns");

        // Performance comparison
        if (timeTaken1 < timeTaken2) {
            System.out.println("\nReverse method is faster.");
        } else if (timeTaken2 < timeTaken1) {
            System.out.println("\nTwo-pointer method is faster.");
        } else {
            System.out.println("\nBoth methods have similar performance.");
        }
    }
}