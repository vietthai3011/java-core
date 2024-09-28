
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van D");
        danhSachSV.offer("Nguyen Van C");

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
