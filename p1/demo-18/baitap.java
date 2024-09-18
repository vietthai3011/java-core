import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a: ");
        a = sc.nextDouble();

        System.out.println("Nhập b: ");
        b = sc.nextDouble();

        System.out.println("Nhập c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("delta = " + delta);

        if (a == 0) {
            System.out.println("Nhập sai dữ liệu");
        } else {
            if (delta < 0) {
                System.out.println("PT vô nghiệm");
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                System.out.println("PT có nghiệm kép x1 = x2 = " + x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }
}
