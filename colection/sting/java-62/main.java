
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stackChuoi = new Stack<String>();
        // stackChuoi.clear();
        // System.out.println(stackChuoi.peek());
        // System.out.println(stackChuoi.pop());
        // System.out.println(stackChuoi.search("Hello"));
        // System.out.println(stackChuoi.contains("Hello"));

        // System.out.println(stackChuoi);

        // String s = sc.nextLine();
        // for (int i = 0; i < s.length(); i++) {
        // stackChuoi.push(s.charAt(i) + "");
        // }

        // System.out.println(stackChuoi);
        // System.out.println(stackChuoi.size());

        // for (int i = 0; i < s.length(); i++) {
        // System.out.print(stackChuoi.pop());
        // }
        Stack<Integer> stackSoDu = new Stack<Integer>();
        int x = sc.nextInt();
        int count = 0;
        while (x > 0) {
            stackSoDu.push(x % 2);
            x /= 2;
            count++;
        }

        int size = stackSoDu.size();

        for (int i = 0; i < size; i++) {
            System.out.println(stackSoDu.pop());
        }
    }
}
