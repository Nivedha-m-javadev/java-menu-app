import java.util.Scanner;
public class oldMain {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        PalindromeCheck P=new PalindromeCheck();

        System.out.print("Enter a word to check: ");
        String input = sc.nextLine();

            // set the name
        P.checkPalindrome();  // check and print result

        sc.close();
    }
}