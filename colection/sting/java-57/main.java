import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        int[] b = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(b));
        double tien = 55000000;

        // Khởi tạo Locale cho tiếng Việt
        Locale lc = Locale.of("vi", "VN");

        // Sử dụng Locale cho tiền tệ Việt Nam
        NumberFormat currencyFormatVN = NumberFormat.getCurrencyInstance(lc);

        // Định dạng và in ra
        String formattedTien = currencyFormatVN.format(tien);
        System.out.println(formattedTien); // Output: 55.000.000 ₫
    }
}
