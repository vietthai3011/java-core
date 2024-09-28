import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String[] str = { "Hello", "world", "123" };
        String s = "Xin chào các bạn, tôi là Java";
        String s2 = "Xin chào, mình là peter. Mình học lập trình";

        String[] arrStr = s.split(" ");

        String a = String.join(" ", str);
        System.out.println(a);
        System.out.println(Arrays.toString(arrStr));
        String[] b = s2.split("\\,|\\.");
        System.out.println(Arrays.toString(b));
    }
}
