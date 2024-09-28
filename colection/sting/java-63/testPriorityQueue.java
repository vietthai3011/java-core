
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class testPriorityQueue {
    public static void main(String[] args) {

        Queue<String> danhSachSV = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }

        });

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
