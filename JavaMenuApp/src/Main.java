import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create objects for each logic class
        PalindromeCheck palindrome = new PalindromeCheck();
        CoutnV vowels = new CoutnV();
        CountLetters alternate = new CountLetters();
        InitialPrint initials = new InitialPrint();

        while (true) {
            System.out.println("\n📘 Java Menu App");
            System.out.println("1. Check if a word is a palindrome");
            System.out.println("2. Count vowels in a sentence");
            System.out.println("3. Print alternate letters from a word");
            System.out.println("4. Get initials from full name");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a word: ");
                    String word1 = sc.nextLine();
                    palindrome.setName(word1);
                    palindrome.checkPalindrome();
                    break;

                case 2:
                    System.out.print("Enter a sentence: ");
                    String sentence = sc.nextLine();
                    vowels.CheckVowels(sentence);
                    break;

                case 3:
                    System.out.print("Enter a word: ");
                    String word2 = sc.nextLine();
                    alternate.StartMethod(word2);
                    break;

                case 4:
                    System.out.print("Enter full name: ");
                    String name = sc.nextLine();
                    initials.Splitting(name);
                    break;

                case 5:
                    System.out.println("Exiting... Bye babe 💛");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
