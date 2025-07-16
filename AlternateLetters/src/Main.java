import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    CountLetters CL= new CountLetters();
    System.out.println("Enter string");
    String input = sc.nextLine();
    CL.StartMethod(input);
    sc.close();
    }
}