import java.util.ArrayDeque;
import java.util.Deque;

public class testDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offerFirst("Nguyen Van A");
        danhSachSV.offerFirst("Nguyen Van B");
        danhSachSV.offerLast("Nguyen Van C");
        danhSachSV.offerLast("Nguyen Van D");

        // for (String string : danhSachSV) {
        // System.out.println(string);
        // }
        System.out.println(danhSachSV.size());

        while (!danhSachSV.isEmpty()) {
            System.out.println(danhSachSV.poll());
        }

        System.out.println(danhSachSV.size());
    }
}
