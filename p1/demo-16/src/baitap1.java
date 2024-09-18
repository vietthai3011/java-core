import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double dienTich = Math.PI * Math.pow(r, 2);
        double chuVi = 2 * Math.PI * r;
        System.out.println(Math.round(dienTich));
        System.out.println(Math.round(chuVi));
    }
}
