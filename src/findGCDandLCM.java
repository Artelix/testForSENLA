import java.util.Scanner;
import java.math.*;

public class findGCDandLCM {
    private static void findLCM(int a, int b, int currMultiple) {
        if (a * currMultiple % b == 0) {
            System.out.println("Наименьшее общее кратное для " + a + " и " + b + " это " + currMultiple * a);
            return;
        }
        findLCM(a, b, currMultiple + 1);
    }

    private static void findGCD(int a, int b, int currDivisor) {
        if (a % currDivisor == 0 && b % currDivisor == 0) {
            System.out.println("Наибольший общий делитель для чисел " + a + " и " + b + " это " + currDivisor);
            return;
        }
        findGCD(a, b, currDivisor - 1);
    }

    public static void main(String[] args) {
        System.out.print("Введите два числа для нахождения НОК и НОД ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        findLCM(max, min, 1);
        findGCD(a, b, min);
    }
}
