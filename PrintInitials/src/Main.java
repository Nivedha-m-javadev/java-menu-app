
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InitialPrint ip = new InitialPrint();

        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();

        ip.Splitting(fullName);

        sc.close();
    }
}
