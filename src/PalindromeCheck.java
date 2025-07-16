public class PalindromeCheck {
    private String name;

    public void setName(String input) {
        this.name = input;
    }

    public void checkPalindrome() {
        String lower = name.toLowerCase();
        String reverse = "";

        for (int i = lower.length() - 1; i >= 0; i--) {
            reverse += lower.charAt(i);
        }

        if (lower.equals(reverse)) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }
}







