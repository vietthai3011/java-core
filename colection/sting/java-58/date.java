import java.sql.Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class date {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());

        Locale lc = Locale.of("vi", "VN");

        System.out.println(date);
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK));

        Calendar c = Calendar.getInstance(lc);

        System.out.println(c.get(7));
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));

        System.out.println(TimeUnit.HOURS.toMinutes(1));

        Scanner sc = new Scanner(System.in);
    }
}
