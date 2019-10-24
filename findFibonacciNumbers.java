import java.util.*;
public class findFibonacciNumbers {
    private static void find(int prevNum, int nextNum, int stop) {
        if (nextNum <= stop) {
            System.out.print(nextNum + "; ");
            find(nextNum, prevNum + nextNum, stop);
        }
        return;
    }

    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        find(0, 1, number);
    }
}
