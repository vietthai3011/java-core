import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();

        Locale lc = new Locale("vi", "Vn");

        for (int i = 0; i < 10; i++) {
            System.out.println("text");
        }

        long t2 = System.currentTimeMillis();
        System.out.println("t1= " + t1);
        System.out.println("t1= " + t2);
        System.out.println("t1 - t2= " + (t2 - t1));

        System.out.println(TimeUnit.MINUTES.toDays(720));

    }
}
