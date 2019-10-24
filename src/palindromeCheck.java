import java.util.Scanner;

public class palindromeCheck {
    private static void check(String input) {
        String reverse = "";
        int length = input.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (reverse.equalsIgnoreCase(input)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter text to process ");
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        check(text);
    }
}
