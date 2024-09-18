import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        String b = "";
        while (a > 0) {
            b = (a % 2) + b;
            a /= 2;
        }
        System.out.println(b);
    }

}
