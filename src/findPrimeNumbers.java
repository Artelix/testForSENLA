import java.util.Scanner;

public class findPrimeNumbers {
    public static void main(String[] args) {
        System.out.print("Enter number ");
        Scanner s = new Scanner(System.in);
        int end = s.nextInt();
        System.out.println("The prime numbers range is:");
        findNumbers(end);
    }

    private static void findNumbers(int number) {
        for (int currNum = 1; currNum <= number; currNum++) {
            for (int i = 2; i <= currNum; i++) {
                if (currNum % i == 0 && i != currNum) {
                    break;
                } else if (currNum == i) {
                    System.out.print(currNum + "; ");
                }
            }
        }
    }
}

