import java.awt.*;
import java.util.Scanner;

public class lineIntersection {
    public static void intersectCheck(Point a, Point b, Point c, Point d) {
        double common = (b.x - a.x) * (d.y - c.y) - (b.y - a.y) * (d.x - c.x);

        if (common == 0) {
            System.out.println("Отрезки не пересекаются");
        }

        double rH = (a.y - c.y) * (d.x - c.x) - (a.x - c.x) * (d.y - c.y);
        double sH = (a.y - c.y) * (b.x - a.x) - (a.x - c.x) * (b.y - a.y);

        double r = rH / common;
        double s = sH / common;

        if (r >= 0 && r <= 1 && s >= 0 && s <= 1) {
            System.out.println("Отрезки пересекаются");
        } else {
            System.out.println("Отрезки не пересекаются");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите координаты точек ");
        Point a = new Point(s.nextInt(), s.nextInt());
        Point b = new Point(s.nextInt(), s.nextInt());
        Point c = new Point(s.nextInt(), s.nextInt());
        Point d = new Point(s.nextInt(), s.nextInt());
        intersectCheck(a, b, c, d);
    }
}

