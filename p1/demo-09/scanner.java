import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap ma so sv: ");
        int maSV = sc.nextInt();
        System.out.println("Nhap diem: ");
        float score = sc.nextFloat();
        System.out.println("Ten sinh vien: " + name
                             + "\nMa so sinh vien: " + maSV
                             + "\nDiem: " + score );
    }
}
