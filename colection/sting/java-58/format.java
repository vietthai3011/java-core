
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class format {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");

        System.out.println(df.format(date));
    }
}
