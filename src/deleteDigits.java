import java.util.*;

public class deleteDigits {
    private static String digitDelete(String input) {
        String output = "";
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if (!Character.isDigit(ch)) {
                output = output + ch;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.print("Enter text to process ");
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        System.out.println("Your text without digits: ");
        System.out.println(digitDelete(text));
    }
}
