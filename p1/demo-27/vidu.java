import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap loi");
        } finally {
            System.out.println("hello");
        }
        System.out.println(n);
    }
}
