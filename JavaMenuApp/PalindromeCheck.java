

public class PalindromeCheck {
    String name;

    public void CheckPalindrome(String input) {
        name = input.toLowerCase();
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

    }
}





