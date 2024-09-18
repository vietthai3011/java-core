/**
 * main
 */
public class main {
    public static void main(String[] args) {    22
        MyDate date1 = new MyDate(30, 11, 2002);
        MyDate date2 = new MyDate(30, 11, 2002);
        System.out.println(date1.equals(date2));

        String a = new String("123");
        String b = new String("123");

        System.out.println(a.getClass() == b.getClass());

    }
}