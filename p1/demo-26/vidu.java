public class vidu {
    public static void main(String[] args) {
        loop: for (int i = 0; i < 10; i++) {
            System.out.println("hello");

            System.out.println(i);

            if (i == 5) {
                continue loop;
            }

            System.out.println("world");
        }
    }
}
