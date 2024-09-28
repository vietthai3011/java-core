
public class test {
    public static void main(String[] args) {
        String s1 = new String("Hello world, xin chao, Hello world");
        String s2 = new String("world");

        System.out.println(s1.regionMatches(true, 6, s2, 0, 3));
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s2, 10));
        System.out.println(s1.lastIndexOf(s2, 17));
    }
}
