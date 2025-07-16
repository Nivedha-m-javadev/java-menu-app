import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc= new Scanner(System.in);
        CoutnV C= new CoutnV();
        System.out.println("Enter character to check");
        String input =sc.nextLine();
        C.CheckVowels(input);
        sc.close();

    }
}