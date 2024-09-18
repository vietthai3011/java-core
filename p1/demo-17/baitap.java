import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float x;
        // ax + b = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vô số nghiệm");
            } else {
                System.out.println("PT vô nghiệm");
            }
        } else {
            x = a / b;
            System.out.println("x = " + x);
        }
    }
}
