import java.util.Scanner;
public class InitialPrint {
    public void Splitting(String input) {
        String[] words = input.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(Character.toUpperCase(word.charAt(0)) + ".");
            }
        }
    }
}

